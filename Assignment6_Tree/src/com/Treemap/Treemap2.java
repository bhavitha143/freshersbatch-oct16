package com.Treemap;

import java.util.*;

public class Treemap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashSet<String> set=new HashSet<String>();  
		  set.add("bhavitha");
		  set.add("sai");  
		  set.add("Ravi");  
		  set.add("Ajay");
		  set.add("bhavitha");
		  set.add("bhavitha");
		  set.add("sai");
		  set.add("rashmi");
		  set.add("ravi");
		  set.add("krishna");
		  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
		 

	}


