package Assignment_string;

public class Stringpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java String pool refers to collection of Strings which are stored in heap memory ";
		System.out.println("string inLowercase:" +str.toLowerCase());
		System.out.println("string inUppercase:" +str.toUpperCase());
		System.out.println( "a,$ :" +str.replace('a', '$'));
		System.out.println("the word collection" +str.contains("collection"));
		String str1 = "java string pool refers to collection of strings which are stored in heap memory ";
        System.out.println("Matches or not:"+str.matches(str1));
        if(str==str1)
        {
        	System.out.println("two string are matched");
        }
        else
        {  System .out.println("two strings are not matched");
        }
        

	}

}
