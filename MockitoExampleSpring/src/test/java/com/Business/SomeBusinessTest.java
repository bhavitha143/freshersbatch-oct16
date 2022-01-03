package com.Business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mockito.DataService;
import com.mockito.SomeBusinessImpl;

public class SomeBusinessTest {

	@Test
	public void testfindGreatestFromAllData() {
		 SomeBusinessImpl businessImpl=new  SomeBusinessImpl(new  DataServiceStub());
		
			int result	= businessImpl.findGreaterFromAllData();
			assertEquals(24, result);
				 
	}
	

}
class  DataServiceStub implements  DataService{

	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24, 6, 15 };
	}
	
}
