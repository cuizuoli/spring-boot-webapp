/*
 * @(#)UserService.java $version 2016年11月16日
 *
 * Copyright 2016 LINE Corporation. All rights Reserved. 
 * LINE Corporation PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cuizuoli.example.service;

import org.springframework.stereotype.Service;

import com.cuizuoli.example.model.User;

/**
 * @author cuizuoli
 *
 */
@Service
public class UserService {

	/**
	 * getUser
	 * @param userID
	 * @return
	 */
	public User getUser(String userID) {
		User user = new User();
		if (userID.equals("test")) {
			user.setUserID("test");
			user.setUserName("Test");
			user.setSex("male");
		}
		return user;
	}

}
