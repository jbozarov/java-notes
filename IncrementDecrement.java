package test;

public class IncrementDecrement {

	public static void main(String[] args) {

		int a = 5; 
		a++; 
		System.out.println(a); // 6
		
		int b = 5; 
		++b; 
		System.out.println(b); // 6
		
		// But lets check other way: 
		int x = 5; 
		int y = 5; 
		System.out.println(x++); // 5 because it displays x first and increments, see next line as proof:
		System.out.println(x);  // 6
		
		System.out.println(++y); // 6 it increments first and then displays so we got 6
		
	}

}
