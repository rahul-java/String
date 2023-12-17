package String;

import java.util.Arrays;

public class StringDemo5 {

	public static void main(String[] args) {
		
		
		String str1="Rahul Kumar Pandey";
		String str2="MEA";
		
		System.out.println(str1.charAt(0));  //R
		System.out.println(str1.length());  //18
		str1.concat(str2);
		System.out.println(str1);  //Rahul Kumar Pandey
		System.out.println(str2);  //MEA
		String str3 = str1.concat(str2);
		System.out.println(str3);  //Rahul Kumar PandeyMEA
		
		//===============================================================================//
		
		if(str1.equals(str3))
			System.out.println("Content is SAME");
		else
			System.out.println("Content is NOT SAME"); //this will print
		
		if(str1==str3)
			System.out.println("Address is SAME");
		else
			System.out.println("Address is NOT SAME");  //this will print
	
		//===================================================================================//
		
		String replace = str1.replace("Kumar", "Bhaiya");
		System.out.println(replace);  //Rahul Bhaiya Pandey
		System.out.println(str1.toUpperCase());  //RAHUL KUMAR PANDEY
		System.out.println(str1.toLowerCase());  //rahul kumar pandey
		
		System.out.println(str1.indexOf('a'));  //1
		System.out.println(str1.lastIndexOf('a'));  //13
		System.out.println(str1.indexOf('z'));  //-1
		
		System.out.println(str1.substring(0));  //Rahul Kumar Pandey
		System.out.println(str1.substring(4));  //l Kumar Pandey
		System.out.println(str1.substring(0,10));  //Rahul Kuma
		//System.out.println(str1.substring(0,50));  //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 0, end 50, length 18
		System.out.println(str1.substring(0,0));  //print nothing
		System.out.println(str1.substring(1,1));  //print nothing
		System.out.println(str1.substring(0,1));  //R first index inclusive last index exclusive
		
		String[] split = str1.split(" ");
		System.out.println(Arrays.toString(split));  //[Rahul, Kumar, Pandey]
	}
}
