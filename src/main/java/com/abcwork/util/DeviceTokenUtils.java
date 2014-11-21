package com.abcwork.util;

import java.util.Random;

import org.junit.Test;

public class DeviceTokenUtils {

	static final String[] hexCharArray = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
	
	@Test
	public void testIphoneToken() {
		
		// 32 bytes  256 bits
		String myToken = "bd27111867960004d32bcae5c12476c752591d67d95095305c88a9ee5f2682b2";
		System.out.println("Token: " + myToken);
		System.out.println("Token Length: " + myToken.length());
		
		String token = generateToken1();
		System.out.println(token);
		System.out.println(token.length());
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			generateToken1();
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			generateToken2();
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (end - start));
		
	}
	
	
	public static String generateToken1() {
		StringBuffer sb = new StringBuffer(64);
		Random r = new Random();
		for (int i = 0; i < 64; i++) {
			sb.append(hexCharArray[r.nextInt(16)]);
		}
		return sb.toString();
	}
	
	public static String generateToken2() {
		StringBuilder sb = new StringBuilder(64);
		Random r = new Random();
		for (int i = 0; i < 64; i++) {
			sb.append(hexCharArray[r.nextInt(16)]);
		}
		return sb.toString();
	}
	
	
}
