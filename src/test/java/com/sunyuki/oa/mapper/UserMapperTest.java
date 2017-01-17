package com.sunyuki.oa.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {
	ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("spring.xml");

	}

	@Test
	public void testCountByExample() {
		System.out.println(ac.getBean("userMapper"));
	}

}
