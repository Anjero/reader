package net.anjero.reader.core.spring.controller;


import net.anjero.reader.core.exception.ForbiddenJsonException;
import net.anjero.reader.module.system.security.pojo.SecurityAdmin;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

/**
 * @author :Anjero
 * @version :1.0
 * @Title :BaseAdminController.java
 * @Description:
 * @Datetime :2013-8-23
 * @Copyright :Copyright (c) 2012
 * @Company :Cheshell
 */
@Controller
public class BaseAdminController extends BaseController {

    public SecurityAdmin getAdmin() throws ForbiddenJsonException {
        return adminUser();
    }

    public Integer getAdminId() throws ForbiddenJsonException {
        if (getAdmin() != null) {
            return getAdmin().getId();
        }
        throw new ForbiddenJsonException("未登录或超时，请重新登录！");
    }

    public String getAdminName() throws ForbiddenJsonException {
        if (getAdmin() != null) {
            return getAdmin().getRealName();
        }
        throw new ForbiddenJsonException("未登录或超时，请重新登录！");
    }

    public SecurityAdmin adminUser() throws ForbiddenJsonException {
        try {
            return (SecurityAdmin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            throw new ForbiddenJsonException("未登录或超时，请重新登录！", e);
        }
    }

}
