package com.javaassignment;

import java.util.Scanner;

public class Taxperctg {

	public static void main(String[] args) {
		double tax=0,it;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Income:");
		int income=s.nextInt();
		if((income<180000))
		{
		System.out.println("No tax");
		}
		else if((income>=180001)&&(income<300000))
		{
		tax=income*(0.01);
		System.out.println("income tax"+tax);
		}
		else if((income>=300001)&&(income<500000))
		{
		tax=income*(0.02);
		System.out.println("income tax"+tax);
		}
		else if((income>=500001)&&(income<1000000))
		{
		tax=income*(0.03);
		System.out.println("income tax"+tax);
		}
		}



	}

