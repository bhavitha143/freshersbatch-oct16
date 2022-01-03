package com.Spring7;

import java.beans.Expression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Spelling {
	public static void main(String[] args)   {  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		
		System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
		}  
		}  

	

	


