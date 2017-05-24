package net.anjero.reader.module.folder.controller;

import net.anjero.reader.core.spring.controller.BaseAdminController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/15</p>
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
@RequestMapping("/admin/folder/manager")
public class FolderManagerAdminController extends BaseAdminController {

    private static final long serialVersionUID = -3871792024761988323L;


    public String index(){
        return "";
    }

    @RequestMapping("/")
    public String upload(){
        return "";
    }
}
