package ikm.examples;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// Primitive Data type copied by value:
		// Wrapper classes are primitive 
		Integer n1 = new Integer(1); 
		Integer n2 = n1; 
		n1+=1; 
		System.out.println(n1); // 2
		System.out.println(n2); // 1
		
		Integer n3 = 11; 
		Integer n4 = n3; 
		n3 +=100; 
		System.out.println(n3); // 111
		System.out.println(n4); // 11
		
		int a = 1000; 
		int b = a; 
		a += 100; 
		System.out.println(a); // 1100
		System.out.println(b); // 1000
		
		
		// Non primitive data type copied by reference:
		List<String> names = new ArrayList<>(); 
		List<String> namesCopy = names;
		
		names.add("John"); 
		names.add("Jacob"); 
		System.out.println(namesCopy);  // [John, Jacob]
		names.remove(1); 
		System.out.println(namesCopy); // [John]
		
		
	}
}
