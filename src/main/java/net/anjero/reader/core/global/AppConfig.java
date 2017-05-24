package net.anjero.reader.core.global;

import net.anjero.reader.core.global.bean.App;
import net.anjero.reader.core.global.bean.Base;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

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

@Configuration
@ConfigurationProperties
public class AppConfig {

    private App app;

    private Base base;

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
