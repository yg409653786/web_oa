package test.java.com.sunyuki.oa.mapper;

import main.java.com.sunyuki.oa.domain.User;
import main.java.com.sunyuki.oa.mapper.UserMapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

	private ApplicationContext ac;

	@Before
	public void setUp() {
		ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void testCountByExample() {
		UserMapper userMapper=(UserMapper) ac.getBean("userMapper");
		User record=new User();
		record.setUsername("测试3");
		record.setEmail("409653786@qq.com");
		userMapper.insert(record);
		System.out.println(userMapper.toString());
	}

	@Test
	public void testDeleteByExample() {
	}

	@Test
	public void testDeleteByPrimaryKey() {
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
	}

	@Test
	public void testSelectByExample() {
	}

	@Test
	public void testSelectByPrimaryKey() {
	}

	@Test
	public void testUpdateByExampleSelective() {
	}

	@Test
	public void testUpdateByExample() {
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
	}

	@Test
	public void testUpdateByPrimaryKey() {
}
}