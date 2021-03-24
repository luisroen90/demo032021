package com.roen.demos.app.common;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ToolsTest {
	
	private static List<String> nums;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		nums = Stream.of("47","65","12").collect(Collectors.toList());
	}

	@Test
	void test() {
		nums.forEach(s->System.out.println("Reverse: " + Tools.binaryReversal(s)));
	}

}
