package com.Assignment11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerUtilsTest1 {

	

	int[]a=new int[] {9,2,7,4,56,1,8};

  @Test
	public void testMaxValue() {
	int max=IntegerUtils.MaxValue(a);
	assert(max==56);
	System.out.println("max test pass");
	}
  @Test
	public void testMinValue() {
	int min=IntegerUtils.MinValue(a);
	assert(min==1);
	System.out.println("min test pass");


	}
}

