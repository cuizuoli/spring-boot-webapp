/*
 * @(#)AbstractTest.java $version 2016年11月16日
 *
 * Copyright 2016 LINE Corporation. All rights Reserved. 
 * LINE Corporation PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.cuizuoli.example;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cuizuoli
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ExampleServerApplication.class, loader = SpringBootContextLoader.class)
public abstract class AbstractTest {

}
