package com.javaassignment;

public class armstrong2 {

	public static void main(String[] args) {
		int i=100, rem, sum,tnum;
		System.out.println("The Armstrong number are:");
		for  (; i<=999; i++)
		{
			tnum = i;
			sum=0;
			while (tnum > 0)
			{
				rem = tnum % 10;
				
				
				sum=sum+rem*rem*rem;
				tnum = tnum / 10;
				}
				if (i == sum)
				System.out.printf("%d\n", sum);
				}


					
			
		}
				
	
		
	

	}

