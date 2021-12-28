package com.Assignment11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycle5Test {
  Math m;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	  System.out.println("This needs to run Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		  System.out.println("This needs to run Afterall");

	}

	@BeforeEach
	void setUp() throws Exception {
		m=new Math();
	}

	@AfterEach
	void tearDown() throws Exception {
		  System.out.println("Cleaning up");

	}

	@Test
	void addition() {
	 int expected=6;
	 int actual=m.addition(2, 4);
	 assertEquals(expected,actual,"\nThe method should add two numbers");
}
	@Test
	void multiplication() {
	int expected=8;
	int actual=m.multiplication(2, 4);
	assertEquals(expected,actual,"\nThe method should multiply two numbers");
	}



	
	}


