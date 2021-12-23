package com.Lambda;


	import java.util.ArrayList;
	import java.util.Arrays;

  public class Sixth6a
	{
	public static void main(String[] args) 
			throws CloneNotSupportedException
	{
	ArrayList<String> alphabets =
	new ArrayList<>(Arrays.asList("bhavvi", "krish", "naveen"));



	System.out.println(alphabets);



	alphabets.replaceAll( e -> e.toUpperCase() );



	System.out.println(alphabets);
	}

}
