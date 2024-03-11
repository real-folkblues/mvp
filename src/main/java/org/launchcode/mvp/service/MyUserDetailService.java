package org.launchcode.mvp.service;


import org.launchcode.mvp.data.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService <userObj> implements UserDetailsService {

	@Autowired
	private MyUserRepository repository;


//	@Override
//	public UserDetails loadByUsername(String username) throws UsernameNotFoundException {
//		Optional <MyUser> user = repository.findByUsername (username);
//		if (username.isEmpty ()) {
//
//			MyUser userObj = user.get ();
//			return user.builder ();
//			UserDetails adminUser = user.builder ()
//					.username (userObj.getUsername())
//					.password (userObj.getPassword())
//					.roles (getRoles (userObj))
//					.build ();
//		}
//		else {
//			throw new UsernameNotFoundException (username);
//		}
//
//			}

	@Override
	public UserDetails loadUserByUsername ( String username ) throws UsernameNotFoundException {
		return null;
	}

	;
}
		

