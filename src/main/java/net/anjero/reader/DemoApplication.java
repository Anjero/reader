package net.anjero.reader;

import net.anjero.reader.core.config.WebApplicationConfiguration;
import net.anjero.reader.core.global.AppConfig;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@EnableAutoConfiguration
@Import(value = {WebApplicationConfiguration.class})
@EnableConfigurationProperties(AppConfig.class)
@ComponentScan("net.anjero.reader")
public class DemoApplication implements EmbeddedServletContainerCustomizer {


    /**
     * 指定自定义yml文件，读取:AppConfig
     *
     * @return
     * @see net.anjero.reader.core.global.AppConfig
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
        yaml.setResources(new ClassPathResource("conf.yml"));
        propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
        return propertySourcesPlaceholderConfigurer;
    }


    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        ErrorPage notFoundPage = new ErrorPage(HttpStatus.NOT_FOUND, "/404");
        ErrorPage forbiddenPage = new ErrorPage(HttpStatus.FORBIDDEN, "/403");
        ErrorPage badRequest = new ErrorPage(HttpStatus.BAD_REQUEST, "/500");
        container.addErrorPages(forbiddenPage, notFoundPage, badRequest);

    }
}
