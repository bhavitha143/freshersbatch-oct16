package com.Business;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.mockito.DataService;
import com.mockito.SomeBusinessImpl;

class SomeBusinessMockitoTest {

	

	@Test
	void testfindGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retriveAllData()).thenReturn( new int[] {24, 6, 15 });
		 SomeBusinessImpl businessImpl=new  SomeBusinessImpl(dataServiceMock);
			
			int result	= businessImpl.findGreaterFromAllData();
			assertEquals(24, result);
				 
	}
	}


