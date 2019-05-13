package com.suresh.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
@Test
public void testSetup(){
	String str="It's working properly";
	assertEquals("It's working properly",str);
}
}
