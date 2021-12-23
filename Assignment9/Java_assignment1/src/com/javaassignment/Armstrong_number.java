package com.javaassignment;

import java.util.Scanner;
public class Armstrong_number 
{ 
	public static void main(String[] args)
	{
     int rem=0, arm=0,m, number=0;
     System.out.println("Enter a number");
     Scanner scan=new Scanner(System.in);
      m=scan.nextInt();
       number=m;
       while(m>0)
      {
    	   rem =m%10;
           arm=arm+rem*rem*rem;
            m =(m/10);
      }
        if(arm==number)
      System.out.print(+number+" is a armstrong number");
else
      System.out.print(+number+" is not a armstrong number");
      }
}

