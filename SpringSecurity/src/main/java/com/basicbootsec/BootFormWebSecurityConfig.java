package com.basicbootsec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BootFormWebSecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/login.htm").loginProcessingUrl("/jlogin.htm").usernameParameter("j_username")
				.passwordParameter("j_password").and().logout().logoutUrl("/jlogout.htm")
				.logoutSuccessUrl("/logout.htm").and().csrf().disable();
		
		http.authorizeRequests().requestMatchers("/home.htm").permitAll().requestMatchers("/account.htm")
				.hasAuthority("customer");
		return http.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails user1 = User.withUsername("bob").password(passwordEncoder().encode("welcome1"))
				.authorities("customer").build();
		UserDetails user2 = User.withUsername("joe").password(passwordEncoder().encode("welcome1"))
				.authorities("customer").build();
		return new InMemoryUserDetailsManager(user1, user2);
	}

}
