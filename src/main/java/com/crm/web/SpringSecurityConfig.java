package com.crm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.crm.web.auth.handler.LoginSuccesHandler;
import com.crm.web.auth.handler.filter.JWTAuthenticationFilter;
import com.crm.web.auth.handler.filter.JWTAuthorizationFilter;
import com.crm.web.service.JpaUserDetailsService;



@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	private LoginSuccesHandler succesHandler; 
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder; 
	
	@Autowired
	private JpaUserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		/*
		 * Implementado seguridad a las Rutas de la aplicacion.
		 */
		http.authorizeRequests().antMatchers("/","/css/**","/scss/**","/js/**","/img/**","/listar/**","/locale**").permitAll()
	    .antMatchers("/datosmaestros/**").hasAnyRole("ADMIN")		
		.antMatchers("/ordencompra/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/actualizacionmasiva/**").hasAnyRole("USER")	
		
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.successHandler(succesHandler)
		.loginPage("/login")
		.permitAll()
		.and()
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/error_403");
		;
		
		
		
		
	}
	
	
	
	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception {
		
		
		//builder.jdbcAuthentication()
		//.dataSource(dataSource)
		
		builder.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);
		
		
		//.usersByUsernameQuery("select username, password, enabled from users where username=?")
		//.authoritiesByUsernameQuery("select u.username, a.authority from authorities a inner join users u on (a.user_id=u.id) where u.username=?");
		
		
		
		 PasswordEncoder encoder = this.passwordEncoder; 
		UserBuilder users = User.builder().passwordEncoder(encoder::encode);
		
		builder.inMemoryAuthentication()
		.withUser(users.username("admin").password("12345").roles("ADMIN","USER"))
		.withUser(users.username("jose").password("123").roles("USER"));
		
		
		
	}


}
