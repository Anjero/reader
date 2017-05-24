package net.anjero.reader.module.system.security.controller;


import net.anjero.reader.core.spring.controller.BaseAdminController;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping
@Log4j
public class SecurityController extends BaseAdminController {

  @RequestMapping(value = "/adminlogin")
  public String adminLogin(HttpServletRequest request, Model model) {
    log.info("gays want to login");
    String error = request.getParameter("error");
    if (!StringUtils.isEmpty(error)) {
      model.addAttribute("error", error);
    }
    return "admin/system/security/login";
  }

}
