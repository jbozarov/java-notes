package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedLists {
	
	public static void main(String[] args) {    
	    // ArrayList and LinkedList are similar, both gets most of the inbuilt methods from List interface. 
	    // adding elements in between LinkedList is faster, it doesn't shift all elements by one index or remove by one index when you remove 
	    // instead of going by index, LinkedList does remember what element is next and what is previous element. 
	    
	    // if you want to request fetch the values by index number, ArrayList is fast and better 
		
		
		// Example, lets create 2 lists: 
		List<Integer> arrayList = new ArrayList<>(); 
		List<Integer> linkedList = new LinkedList<>(); 
		
		// Loop 100 000 times and add Integers: 
		for (int i = 0; i<100000; i++ ) {
			linkedList.add(i); 
			arrayList.add(i); 
		}
		
		
		// Retrieve specific element close to end: 
		final long startTimeAL1 = System.nanoTime(); 
		arrayList.get(95000); 
		final long endTimeAL1 = System.nanoTime(); 
		long totalTimeArrayList1 = startTimeAL1 - endTimeAL1; 
		
		final long startTimeLL1 = System.nanoTime(); 
		linkedList.get(95000); 
		final long endTimeLL1 = System.nanoTime(); 
		long totalTimeLinkedList1 = startTimeLL1 - endTimeLL1; 
		
		System.out.println("Total execution time for clost to end of list : " + totalTimeArrayList1);   // -15300
		System.out.println("Total execution time for clost to end of list :" + totalTimeLinkedList1); // -165700
		
		// we can see ArrayList is much faster in execution. But let's do something else: 
		
		// Retrieve specific element close to beginning: 
		final long startTimeAL2 = System.nanoTime(); 
		arrayList.remove(1); 
		final long endTimeAL2 = System.nanoTime(); 
		long totalTimeArrayList2 = startTimeAL2 - endTimeAL2; 
		
		final long startTimeLL2 = System.nanoTime(); 
		linkedList.remove(1); 
		final long endTimeLL2 = System.nanoTime(); 
		long totalTimeLinkedList2 = startTimeLL2 - endTimeLL2; 
		
		System.out.println("Total execution time for close to beginnig " + totalTimeArrayList2); // 123500
		System.out.println("Total execution time for close to beginnig " + totalTimeLinkedList2); // 37500
		
		// Because once we remove from ArrayList, it has to shift all other elements
		
		// Conclusion ArrayList is better to get specific element, doesn't have to loop it finds directly, but when you add or remove in the middle of the 
		// ArrayList it shifts all elements which takes time.
		
		// On the other hand, LinkedList doesn't shift so when you add, remove element it does faster, but when you want to retrieve specific 
		// element it still loops so it takes time. 
	    
	}
	
	
}
