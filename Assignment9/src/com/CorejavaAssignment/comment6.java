package com.CorejavaAssignment;

import java.util.Arrays;
import java.util.List;

public class comment6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<News> newsObj=Arrays.asList(
				new News(111,"budget","Good","Good Job"),
				new News(222,"postedByUser2","Excellent","Nice Job"),
				new News(333,"postedByUser3","Average","Not Bad")
				);
				
		newsObj.stream().forEach(p -> System.out.println(""+p.getCommentByUser()));
	}

	

	}


