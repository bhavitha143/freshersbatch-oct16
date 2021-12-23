package com.Lambda;

	import java.util.Arrays;
	import java.util.Objects;
	import java.util.stream.Collectors;





	public class Firstletter_5 {
	public static void main(String[] args)
	{
	String[] strArray = { "Red", "sai", "Bhavvi", "Yellow", "Violet",  "Purple" };



	System.out.println(Arrays.stream(strArray).filter(Objects::nonNull).
	map(s->s.charAt(0)).collect(Collectors.toList()));
	}



	}


