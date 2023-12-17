package String;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		
		
		String s1="10";
		String s2="20";
		
		System.out.println(s1+s2);  //1020
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);//30
		//valueOf() ->Static Method
		System.out.println(String.valueOf(a)+String.valueOf(b)); //1020
		
		String str1="Rahul";
		
		System.out.println(str1.startsWith("R"));  //true
		System.out.println(str1.startsWith("r"));  //false
		
		System.out.println(str1.endsWith("L"));  //false
		System.out.println(str1.endsWith("ul"));  //true
		
		String str2=" RAHUL ";
		System.out.println(str2.trim());//RAHUL
		
		String str3="Rahul Kumar Pandey";
		char[] charArray = str3.toCharArray();
		System.out.println(charArray);  //Rahul Kumar Pandey
		System.out.println(Arrays.toString(charArray));  //[R, a, h, u, l,  , K, u, m, a, r,  , P, a, n, d, e, y]
	}
}
