package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SimpleAuthenticationSuccessHandler handle;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http
            // .authorizeRequests()
            //     .antMatchers("/").permitAll()
            //     .anyRequest().authenticated()
            //     .and()
            // .formLogin()
            //     .loginPage("/login")
            //     .permitAll()
            //     .and()
            // .logout()
            //     .permitAll();
            http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/login")).and().authorizeRequests()
    				.antMatchers("/user").hasRole("USER")
    				.antMatchers("/admin").hasRole("ADMIN")
    				.and().formLogin().successHandler(handle)
    				.loginPage("/login").and().logout().permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("student").password("password").roles("USER");
        auth
            .inMemoryAuthentication()
                .withUser("teacher").password("password").roles("ADMIN");
    }
}
