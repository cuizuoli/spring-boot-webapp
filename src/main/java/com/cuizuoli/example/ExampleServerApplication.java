/*
 * @(#)ExampleServerApplication.java $version 2016年11月16日
 *
 * Copyright 2016 LINE Corporation. All rights Reserved. 
 * LINE Corporation PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cuizuoli.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Example Server Application.
 * @author cuizuoli
 *
 */
@SpringBootApplication
public class ExampleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleServerApplication.class, args);
	}

}
