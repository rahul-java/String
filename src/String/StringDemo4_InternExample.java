package String;

public class StringDemo4_InternExample {
	
	public static void main(String args[]) {
	
		//intern()=>it is used to access the object from SCP
		
		String s1 = new String("hello");  //HEAP memory
		String s2 = "hello";  //SCP POOL
		String s3 = s1.intern();// returns string from pool, now it will be same as s2
		
		System.out.println(s3);  //hello
		System.out.println(s1 == s2);// false because reference is different
		System.out.println(s2 == s3);// true because reference is same
		System.out.println(s1==s3);  //false bcoz s1 store address from heap and s3 store address from SCP
	}
}
