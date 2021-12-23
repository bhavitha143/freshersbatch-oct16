package com.javaassignment;

import java.util.Scanner;

public class Culappliction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter ur username");
		username=s.nextLine();
		System.out.println("entered username "+username);
		int c=3;
		while(true)
		{
		System.out.println("Enter ur password");
		String ps=s.nextLine();
		System.out.println(" password "+ps);
		if (ps.compareTo("bhavitha")==0)
		{
		System.out.println("welcome"+username);
		break;
		}
		else
		{
		c--;
		if(c==0)
		{
		System.out.println("contact admin");
		break;
		}
		System.out.println("wrong password.attemps remaining:"+c);
		} }
		}}

