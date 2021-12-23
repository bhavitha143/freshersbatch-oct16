package com.Generic;

import java.util.ArrayList;
import java.util.*;

public class Generic1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s1,s2;
		
		List<Integer> list=new ArrayList<Integer>(); 
		list.add(100);
		list.add(102);
		Iterator<Integer>itr = list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next()+" ");
		}
		
		System.out.println("After swapping");
		
		Collections.swap(list,  0, 1);
		System.out.println(" "+list);
		
		
		
		}
		
	 

	}

