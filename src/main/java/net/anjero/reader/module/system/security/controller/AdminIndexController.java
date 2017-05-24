package net.anjero.reader.module.system.security.controller;

import net.anjero.reader.core.spring.controller.BaseAdminController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>cheshell Create by 14/12/16 上午10:12</p>
 *
 * @author :anjero by Cheshell Copyright (c) 2012
 * @version :1.0
 */

@Controller
@RequestMapping("/admin")
public class AdminIndexController extends BaseAdminController {

  @GetMapping(value = "/dashboard")
  public String dashboard() {
    return "dashboard";
  }

  @GetMapping("/page1")
  public String page1() {
    return "page1";
  }
  @GetMapping("/page2")
  public String page2() {
    return "page2";
  }
  @GetMapping("/page3")
  public String page3() {
    return "page3";
  }
}
