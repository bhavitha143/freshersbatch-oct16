package com.javaassignment;

import java.util.Scanner;

public class Subjectcondtion {

	public static void main(String[] args) {
		 
		int sub1 , sub2, sub3, totalmarks;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter subject1 marks:");
		sub1=s.nextInt();
		System.out.println("Enter subject2 marks:");
		sub2=s.nextInt();
		System.out.println("Enter subject3 marks:");
		sub3=s.nextInt();
		totalmarks=sub1+sub2+sub3;
		if((sub1>60)&&(sub2>60)&&(sub3>60))
		{
		System.out.println("passed");
		}
		else if(((sub1>60)&&(sub2>60))||((sub1>60)&&(sub3>60))||((sub2>60)&&(sub3>60)))
		{
		System.out.println("promoted");
		}
		else if((((sub1>60)&&((sub2<60)&&(sub3<60)))||
		((sub2>60)&&((sub3<60)&&(sub1<60)))||
		((sub3>60)&&((sub2<60)&&(sub1<60)))||(totalmarks<60)))
		{
		System.out.println("failed");
		} 
	}
}






