package net.anjero.reader.core.config;

import net.anjero.reader.module.system.security.core.MyFilterSecurityInterceptor;
import net.anjero.reader.module.system.security.core.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.dao.ReflectionSaltSource;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Created by tomoya on 4/19/17.
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    MyUserDetailService myUserDetailService;

    @Autowired
    private MyFilterSecurityInterceptor myFilterSecurityInterceptor;

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http.headers().frameOptions().disable();//in a frame because it set 'X-Frame-Options' to 'DENY'. "错误解决方式

        http.authorizeRequests()
                .antMatchers("/static/**","/demo/**").permitAll()
                .antMatchers("/admin/**").authenticated();

        http
                .formLogin()
                .loginPage("/adminlogin")
                .loginProcessingUrl("/adminlogin")
                .usernameParameter("username")
                .passwordParameter("password")
                .failureUrl("/adminlogin?error=true")
                .defaultSuccessUrl("/admin/dashboard")
                .permitAll();
        http
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/adminlogin");
//        http.csrf().ignoringAntMatchers("/demo/index","/demo/index2");
        http.addFilterBefore(myFilterSecurityInterceptor, FilterSecurityInterceptor.class);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setPasswordEncoder(new Md5PasswordEncoder());
//        authProvider.setUserDetailsService(myUserDetailService);
        ReflectionSaltSource saltSource = new ReflectionSaltSource();
        saltSource.setUserPropertyToUse("username");
        authProvider.setSaltSource(saltSource);
        authProvider.setUserDetailsService(myUserDetailService);
        auth.authenticationProvider(authProvider);


//        auth.userDetailsService(myUserDetailService).passwordEncoder(new Md5PasswordEncoder());
    }
}
