package StringBuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		//String Builder is mutable
		//NOT Thread Safe (Multiple thread can access at a time) 
		//Jdk 1.5
		//fast performance
		
		StringBuilder stringBuilder = new StringBuilder("hello");
		System.out.println(stringBuilder);  //hello
		stringBuilder.append("demo");
		System.out.println(stringBuilder);  //hellodemo
		System.out.println(stringBuilder.reverse());  //omedolleh
		System.out.println(stringBuilder.length());//9
		
	}
}
