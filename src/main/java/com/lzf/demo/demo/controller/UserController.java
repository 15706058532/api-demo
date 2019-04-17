package com.lzf.demo.demo.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.demo.demo.service.UserService;

/**
 * 写点注释
 * <br/>
 * Created in 2019-04-03 18:06:12
 * <br/>
 *
 * @author Lzf
 */
@RestController
@RequestMapping("/user")
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class); 
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

}
