package net.anjero.reader.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * 描述
 *
 * @author ninglei
 * @time 2017/4/20  下午4:29
 */
@Configuration
public class FreeMarkerConfig {
    @Autowired
    private freemarker.template.Configuration configuration;

}
