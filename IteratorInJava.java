package test;

import java.util.ArrayList;
import java.util.*;

public class IteratorInJava {

	public static void main(String[] args) {

	    // Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Print the first item
    
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
	    List<Integer> nums = new ArrayList<>(); 
	    nums.add(1); 
	    nums.add(2); 
	    nums.add(3); 
	    
	    Iterator<Integer> iterator = nums.iterator(); 
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	  }
	

}
