package net.anjero.reader.module.system.security.core;

import net.anjero.reader.module.system.security.pojo.SecurityAdmin;
import net.anjero.reader.module.system.security.pojo.SecurityAuth;
import net.anjero.reader.module.system.security.service.AdminService;
import net.anjero.reader.module.system.security.service.AuthService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Log4j
public class MyUserDetailService implements UserDetailsService {

  @Autowired
  private AdminService adminService;
  @Autowired
  private AuthService authService;

  public UserDetails loadUserByUsername(String username) {
    SecurityAdmin admin = adminService.login(username);
    Collection<GrantedAuthority> auths = new ArrayList<>();
    if (admin != null) {
      List<SecurityAuth> adminAuths = authService.selectByAdmin(admin.getId());
      for (SecurityAuth auth : adminAuths) {
        GrantedAuthority ga = new SimpleGrantedAuthority(auth.getName());
        auths.add(ga);
      }
      return new User(username, admin.getPassword(), auths);
    } else {
      throw new UsernameNotFoundException("admin:" + username + " do not exist!!");
    }
  }
}
