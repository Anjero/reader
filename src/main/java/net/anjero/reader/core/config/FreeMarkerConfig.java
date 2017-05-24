package net.anjero.reader.core.config;

import net.anjero.reader.core.global.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 *
 * @author ninglei
 * @time 2017/4/20  下午4:29
 */
@Component
public class FreeMarkerConfig extends FreeMarkerAutoConfiguration.FreeMarkerWebConfiguration {


    Logger log = LoggerFactory.getLogger(FreeMarkerConfig.class);

    @Autowired
    private AppConfig appConfig;

    @Override
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = super.freeMarkerConfigurer();
        Map<String, Object> sharedVariables = new HashMap<>();
        sharedVariables.put("app", appConfig.getApp());
        configurer.setFreemarkerVariables(sharedVariables);

        log.info("init freemarker sharedVariables {app} success...");
        return configurer;
    }

}
