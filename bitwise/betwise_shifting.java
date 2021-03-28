package test;

public class Main {

	public static void main(String[] args) {
		System.out.println(9>>2);
		System.out.println(9>>1);
		System.out.println(9>>0);
		
		System.out.println(9<<1); // 18 shifting to the right: 
		//  9 is:										1  0  0  1
		//  shifting to the left <<                  1  0  0  1  0  we shifted each number to the right and 10010 is 18 in decimal
		
		System.out.println(9>>>1);
	}
}
