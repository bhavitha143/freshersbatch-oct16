package com.Assignment11;

public class LifeCycle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Math m=new Math();
	System.out.println("Addition of two values :"+m.addition(2, 4));

	System.out.println("Addition of two values :"+m.multiplication(2, 4));
		}

	}


class Math
{
	public int addition(int a, int b) {
		return(a+b);
		
	}

	
	public int multiplication(int a,int b) {
		return(a*b);
	}
	
	
}