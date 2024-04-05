package org.launchcode.mvp.config;


import org.launchcode.mvp.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfiguration {

	@Autowired
	private MyUserDetailService userDetailService;


	@Bean
	public SecurityFilterChain securityFilterChain( HttpSecurity httpSecurity ) throws Exception {
		return httpSecurity
				.authorizeHttpRequests (registry->{
			registry.requestMatchers("/home").permitAll ();
			registry.requestMatchers("/admin/**").hasRole ("ADMIN");
			registry.requestMatchers("/user/**").hasRole ("USER");
					registry.anyRequest ().authenticated ();
				})
				.formLogin (AbstractAuthenticationFilterConfigurer::permitAll)
				.build ();
	}

//	@Bean
//	public MyUserDetailsService myUserDetailsService(){
//		UserDetails normalUser= User.builder ()
//				.username ("Marleny")
//				.password ("$2a$12$xPx4U8zA5IK.nflm3y4ofOqEj3e8O/7Mw973PAsAR9/I/3G4YRrXC")
//				.roles ("USER")
//				.build ();
//		UserDetails adminUser= User.builder ()
//				.username ("admin")
//				.password ("$2a$12$/7Q2.zjEWrigDtA2nV6bseRiTDtLpy6Vx3ji9JlkvgW0R19GyQSja")
//				.roles ("ADMIN", "USER")
//				.build ();
//
//	return new InMemoryUserDetailsManager (normalUser, adminUser);
//	}

	@Bean
	public UserDetailsService userDetailsService(){
		return userDetailService;
	}

	@Bean
	public AuthenticationProvider authenticationProvider(){
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider ();
	provider.setUserDetailsService (userDetailService);
	provider.setPasswordEncoder (passwordEncoder ());
	return provider;

	}


	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder ();
	}
}
