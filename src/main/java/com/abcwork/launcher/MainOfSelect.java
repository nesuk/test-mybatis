package com.abcwork.launcher;

import java.util.concurrent.TimeUnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abcwork.entity.DeviceToken;
import com.abcwork.mapper.DeviceTokenMapper;
import com.abcwork.util.DeviceTokenUtils;

public class MainOfSelect {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:app-context.xml");
		DeviceTokenMapper mapper = ctx.getBean(DeviceTokenMapper.class);
		
		int exCount = 0;
		for (int i = 10478740; i < 100000000; i++) {
			try {
				mapper.add(new DeviceToken(Long.valueOf(i+""), DeviceTokenUtils.generateToken1()));
				TimeUnit.MICROSECONDS.sleep(1);
				if (i % 1000000 == 0)
					System.out.println("已插入 " + (i - 10000000));
			} catch (Exception e) {
				exCount++;
				System.out.println("\n\n----> " + exCount + " <----\n\n");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
		System.out.println("冲突次数：" + exCount);
		
	}
}
