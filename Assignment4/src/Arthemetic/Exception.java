package Arthemetic;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			   int a = 5;
		        int b = 0;
		        try {
		            System.out.println(a / b); // throw Exception
		        }
		        catch (ArithmeticException e) {
		            // Exception handler
		            System.out.println( "Divided by zero ");
			
		

	}

}
}
