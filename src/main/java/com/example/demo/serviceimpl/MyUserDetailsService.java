package com.example.demo.serviceimpl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		return new MyUserDetails(s);
	}
}
