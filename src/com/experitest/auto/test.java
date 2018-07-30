package com.experitest.auto;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;




public class test extends SetupClass {
	private static Logger log = Logger.getLogger(test.class);
	
	@Test
	public void test1() {
		System.out.println("@@@@@#######testexecution@##########");
		log.info("test1 is passed");
	}
	@Test
	public void test2() {
		System.out.println("@@@@@#######testexecution@##########");
		log.info("test2 is passed");
		
	}
	@Test
	public void test3() {
		System.out.println("@@@@@#######testexecution@##########");
		assertEquals(true,false);
	}

	
}
