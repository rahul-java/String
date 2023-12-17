package String;

public class StringDemo {

	public static void main(String[] args) {
		
		//Approach - 1 //String Literal
		String str1="Hi";  //memory allocation in SCP StringConstantPool
		
		//Approach - 2 // using new operator
		String str2=new String("hello");  //Stored in Heap Memory
		
		System.out.println(str1);  //Hi
		System.out.println(str2);  //hello
		
		str1.concat(str2);
		System.out.println(str1);  //Hi
		
		System.out.println(str1.concat(str2));  //Hihello
	}
}
