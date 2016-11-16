/*
 * @(#)UserServiceTest.java $version 2016年11月16日
 *
 * Copyright 2016 LINE Corporation. All rights Reserved. 
 * LINE Corporation PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cuizuoli.example.service;

import javax.annotation.Resource;

import org.junit.Test;

import com.cuizuoli.example.AbstractTest;

/**
 * @author cuizuoli
 *
 */
public class UserServiceTest extends AbstractTest {

	@Resource
	private UserService userService;

	@Test
	public void getUser() {
		System.out.println(userService.getUser("test"));
	}

}
