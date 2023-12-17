package String;

public class StringDemo2 {

	public static void main(String[] args) {
		
		
		String str1="Hi"; // SCM->StringConstantPool

		String str2="Hi"; // SCM->StringConstantPool
		
		if(str1==str2) //it will compare the address of the string
			System.out.println("Both are same");  //this will print
		else
			System.out.println("Not same");
		
		//=================================================================================//
		
		String str3=new String("Hi"); //Heap Memory
		
		if(str1==str3) //it will compare the address of the string
			System.out.println("Both are same");
		else
			System.out.println("Not same");  //this will print
		
		//=================================================================================//
		
		String str4=new String("Hi"); //Heap Memory
		
		if(str3==str4)
			System.out.println("Both are same");
		else
			System.out.println("Not same");  //this will print
		
		//=================================================================================//
		
		
	
	}
}
