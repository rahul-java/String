package String;

public class StringDemo3 {

	public static void main(String[] args) {
		
		
		String str1="Rahul";  //1 SCP
		String str2="Rahul";  //0 SCP
		String str3=new String("Rahul");  //1  HEAP
		String str4=new String("Rahul");  //1  HEAP
		String str5=new String("Hi");     //2  SCP , HEAP
		String str6=new String("Hello");  //2  SCP , HEAP
		
		//Total no of objects created :: 7
		
		if(str1==str2) 
			System.out.println("Both are same");  //this will print
		else
			System.out.println("Not same");
		
		if(str2==str3) 
			System.out.println("Both are same");  
		else
			System.out.println("Not same");  //this will print
		
		if(str3==str4) 
			System.out.println("Both are same");  
		else
			System.out.println("Not same");  //this will print
		
		
		System.out.println(str1.intern());  //Rahul
	
	}
}
