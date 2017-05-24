package net.anjero.reader.core.spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.anjero.reader.core.json.Result;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

//import com.ichefeng.data.module.agency.pojo.AgencyUser;
//import com.ichefeng.data.module.agency.pojo.AgencyUserToken;
//import com.ichefeng.data.module.agency.service.AgencyUserService;
//import com.ichefeng.data.module.agency.service.AgencyUserTokenService;


/**
 * @author :Anjero
 * @version :1.0
 * @Title :BaseController.java
 * @Description:
 * @Datetime :2013-8-29
 * @Copyright :Copyright (c) 2012
 * @Company :Cheshell
 */
public class BaseController implements Serializable {

//    @Resource
//    private AgencyUserTokenService agencyUserTokenService;
//    @Resource
//    private AgencyUserService agencyUserService;

  public static final String REDIRECT = "redirect:";
  private static final long serialVersionUID = 7544640703613411536L;

  /**
   * 控制器LOG
   */
  protected Logger LOG = Logger.getLogger("controller");

  /**
   * 用户session
   */
  public static final String SESSION_ADMIN = "session_admin";

  public static final String SESSEION_USER = "sesseion_user";

  public static final String WECHAT_USER_SESSION = "wechat_user_session";

  public static final String SESSEION_PRO = "sesseion_province";

  protected String success(Object obj) {
    Result result = new Result();
    result.setCode(200);
    result.setResult(obj);
    result.setDescription("succuss");
    try {
      return new ObjectMapper().writeValueAsString(result);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
//
//  /**
//   * 返回的json里有Date类型的属性时，将时间格式化成 pattern 类型
//   *
//   * @param obj
//   * @param pattern ApplicationConstants 里有对应的属性
//   * @return
//   */
//  protected String successWithDateTime(Object obj, String pattern) {
//    Result result = new Result();
//    result.setCode(200);
//    result.setResult(obj);
//    result.setDescription("succuss");
//    try {
//      return new ObjectMapper().writeValueAsString(result);
//    } catch (Exception e) {
//      e.printStackTrace();
//      return null;
//    }
//  }

  protected String redirect(String location) {
    return REDIRECT + location;
  }

  protected String success() {
    return success(null);
  }

  protected Map<String, String> error() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("code", "201");
    return map;
  }

  protected String error(String message) {
    Result result = new Result();
    result.setCode(201);
    result.setResult(null);
    result.setDescription(message);
    try {
      return new ObjectMapper().writeValueAsString(result);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  protected void addAlertMessage(Model model, String msg) {
    model.addAttribute("msg", msg);

  }

  protected HttpServletRequest getRequest() {
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    return request;
  }


  protected void printWriterJSON(HttpServletResponse response, String result) {
    response.setContentType("application/x-json;charset=UTF-8");
    //response.setCharacterEncoding("UTF-8");
    try {
      PrintWriter out = response.getWriter();
      out.println(result);
      out.flush();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
