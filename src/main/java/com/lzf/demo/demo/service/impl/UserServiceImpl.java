package com.lzf.demo.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lzf.demo.demo.service.UserService;
import com.lzf.demo.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 写点注释
 * <br/>
 * Created in 2019-04-03 18:06:12
 * <br/>
 *
 * @author Lzf
 */
@Service
public class UserServiceImpl implements UserService {
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class); 
	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
