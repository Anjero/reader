package net.anjero.reader.core.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/9</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */

@org.springframework.context.annotation.Configuration
@MapperScan("com.example.module")
public class MyBatisConfig implements ConfigurationCustomizer{


    Logger log = LoggerFactory.getLogger(MyBatisConfig.class);

    @Override
    public void customize(Configuration configuration) {
        log.info("read mybatis config..");
    }
}
