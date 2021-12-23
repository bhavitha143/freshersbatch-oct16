package com.CorejavaAssignment;


	
	import java.util.Arrays;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	public class Group
	{
	public static void main(String[] args) {
	List<fruit> fruits= Arrays.asList(
	new fruit("apple",40,60,"red"),
	new fruit("banna",79,80,"yellow"),
	new fruit("mango",70,60,"yellow"),
	new fruit("orange",50,70,"orange"),
	new fruit("grapes",60,50,"green"),
	new fruit("guva",30,40,"green")
	);
	Collections.sort(fruits,(o1,o2)->(o2.getCalories()-o1.getCalories()));



	Collections.sort(fruits,(o1,o2)->(o1.getPrice()-o2.getPrice()));
	fruits.stream()
	.forEach(p ->System.out.println(p.toString()));
	}


}
	
