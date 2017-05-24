package net.anjero.reader.module.global.common;

import net.anjero.reader.core.exception.ForbiddenJsonException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

@Controller
@RequestMapping("/test")
public class TestErroController {

    @RequestMapping("/page")
    public String errorPage() throws Exception {
        throw new Exception("出错啦！！");
    }

    @GetMapping("json")
    @ResponseBody
    public String jsonError() throws ForbiddenJsonException {
        throw new ForbiddenJsonException("error!!!");
    }
}
