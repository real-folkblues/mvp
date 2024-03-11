//package org.launchcode.mvp.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//public class SecurityConfiguration {
//
//	@Bean
//	public SecurityFilterChain securityFilterChain( HttpSecurity httpSecurity ) throws Exception {
//		return httpSecurity
//				.authorizeHttpRequests (registry->{
//			registry.requestMatchers("/home").permitAll ();
//			registry.requestMatchers("/admin/**").hasRole ("ADMIN");
//			registry.requestMatchers("/user/**").hasRole ("USER");
//					registry.anyRequest ().authenticated ();
//				})
//				.formLogin (AbstractAuthenticationFilterConfigurer::permitAll)
//				.build ();
//	}
//
//	@Bean
//	public UserDetailsService userDetailsService(){
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
//
//	@Bean
//	public PasswordEncoder passwordEncoder(){
//		return new BCryptPasswordEncoder ();
//	}
//}
