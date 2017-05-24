package net.anjero.reader.module.global.common;

import net.anjero.reader.core.exception.ForbiddenJsonException;
import net.anjero.reader.core.json.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/16</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */

@ControllerAdvice
public class ErroPageController {

    private static final long serialVersionUID = 7055795001933656830L;


    public static final String DEFAULT_ERROR_VIEW = "error/500";

    @ExceptionHandler(Exception.class)
    public ModelAndView errorPage(HttpServletRequest req, Exception e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);

        return mav;
    }

    @ExceptionHandler(value = ForbiddenJsonException.class)
    @ResponseBody
    public Result jsonErrorHandler(HttpServletRequest req, ForbiddenJsonException e) throws Exception {
        Result r = new Result();
        r.setCode(201);
        r.setDescription("error url:" + req.getRequestURL());
        r.setResult(e.getMessage());
        return r;
    }
}
