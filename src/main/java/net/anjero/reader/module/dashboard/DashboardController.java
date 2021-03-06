package net.anjero.reader.module.dashboard;

import net.anjero.reader.core.spring.controller.BaseAdminController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/10</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */

@RequestMapping("/admin/dashboard")
public class DashboardController extends BaseAdminController {

    @RequestMapping
    public String dashboard(){
        return "dashboard/dashboard";
    }
}
