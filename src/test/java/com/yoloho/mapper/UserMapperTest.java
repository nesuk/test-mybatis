package com.yoloho.mapper;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abcwork.entity.User;
import com.abcwork.mapper.UserMapper;

public class UserMapperTest {

	private static ClassPathXmlApplicationContext ctx = null;
	private static UserMapper userMapper = null;

	@BeforeClass
	public static void init() {
		ctx = new ClassPathXmlApplicationContext(
				new String[] { "app-context.xml" });
		ctx.start();

		userMapper = ctx.getBean(UserMapper.class);
	}

	@AfterClass
	public static void destroy() {
		ctx.close();
	}

	@Test
	public void getTest() {
		if (userMapper != null) {
			User user = userMapper.get(4l);
			if (user != null)
				System.out.println(user);
		}
	}

	@Test
	public void addTest() {
		User user = new User();
		user.setPassword("password");
		user.setNick("nick");
		userMapper.add(user);
	}

	@Test
	public void getByPageTest() {
		
		List<User> list = userMapper.getByPage(0, 5);
		for (User u : list) {
			System.out.println(u);
		}
		
		System.out.println();
		
		list = userMapper.getByPage(null, null);
		for (User u : list) {
			System.out.println(u);
		}
				
	}
}
