package net.anjero.reader.module.system.security.core;

import net.anjero.reader.module.system.security.pojo.SecurityAuth;
import net.anjero.reader.module.system.security.service.AuthService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 此类在初始化时，应该取到所有资源及其对应角色的定义
 *
 * @author Robin
 */
@Service
@Log4j
public class MyInvocationSecurityMetadataSource implements
    FilterInvocationSecurityMetadataSource {

  @Autowired
  private AuthService authService;

  private HashMap<String, Collection<ConfigAttribute>> map = null;

  /**
   * 加载资源，初始化资源变量
   */
  public void loadResourceDefine() {
    map = new HashMap<>();
    Collection<ConfigAttribute> array;
    ConfigAttribute cfg;
    List<SecurityAuth> auths = authService.selectAll();
    for (SecurityAuth auth : auths) {
      array = new ArrayList<>();
      cfg = new SecurityConfig(auth.getName());
      array.add(cfg);
      map.put(auth.getUrl(), array);
    }
    log.info("security info load sucess!!");
  }


  /**
   * 根据路径获取访问权限的集合接口
   *
   * @param object
   * @return
   * @throws IllegalArgumentException
   */
  @Override
  public Collection<ConfigAttribute> getAttributes(Object object)
      throws IllegalArgumentException {
    if (map == null) {
      loadResourceDefine();
    }
    HttpServletRequest request = ((FilterInvocation) object)
        .getHttpRequest();
    AntPathRequestMatcher matcher;
    String resUrl;
    for (Iterator<String> iter = map.keySet().iterator(); iter.hasNext(); ) {
      resUrl = iter.next();
      matcher = new AntPathRequestMatcher(resUrl);
      if (matcher.matches(request)) {
        return map.get(resUrl);
      }
    }

    return null;
  }

  /**
   * @return
   */
  @Override
  public Collection<ConfigAttribute> getAllConfigAttributes() {
    return null;
  }

  /**
   * @param clazz
   * @return
   */
  @Override
  public boolean supports(Class<?> clazz) {
    return true;
  }
}
