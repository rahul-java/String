package StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//String Buffer is mutable
		//Thread Safe (only one thread can access at a time)
		//jdk 1.0
		//slow performance
		
		StringBuffer stringBuffer = new StringBuffer("hello");
		System.out.println(stringBuffer);  //hello
		stringBuffer.append("demo");
		System.out.println(stringBuffer);  //hellodemo
		System.out.println(stringBuffer.reverse());  //omedolleh
		
	}
}
