package com.mockito;

public class SomeBusinessImpl {
	private DataService dataService;
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findGreaterFromAllData() {
	int[]data=((DataService) dataService).retriveAllData();
	int greatest = Integer.MIN_VALUE;
	for(int value:data) {
		if(value>greatest)
		{
			greatest=value;
		}
	}
	return greatest;
		
	}
}
	
	
	


