package com.roen.demos.app.common;

public class Tools {

	public static String binaryReversal(String n) {

		int num = (n != null && !n.isBlank()) ? Integer.valueOf(n) : 0;

		StringBuilder s = new StringBuilder(String.format("%08d", Integer.parseInt(Integer.toBinaryString(num))));

		return String.valueOf(Integer.parseInt(s.reverse().toString(), 2));
	}

}
