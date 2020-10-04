package test;

public class Main {

	public static void main(String[] args) {
		
		// 38 in binary will be 100110
		// 23 in binary will be  10111
		// so | (pipe means or returns true (1) if one of them is true:
						// 1 or 0 returns true (1)
						// 0 or 0 returns false (0)
						// 0 or 1 returns true (1)
						// 1 or 1 return true (1) 
		
		
		// so & (ampersand means and returns true (1) if both of them is true:
						// 1 or 0 returns false (0)
						// 0 or 0 returns false (0)
						// 0 or 1 returns false (0)
						// 1 or 1 return true (1) 
		
		
		// so ^ (caret means or returns true (1) if one of them is true and the other is false:
						// 1 or 0 returns true (1)
						// 0 or 0 returns false (0)
						// 0 or 1 returns true (1)
						// 1 or 1 return false (0) 
		
		// Now let's compare what we had:
		// in decimal                       32  16   8   4   2   1
		
		// 38 in binary will be:             1   0   0   1   1   0
		// 23 in binary will be:                 1   0   1   1   1
		
		// for | pipe it will be             1   1   0   1   1   1 total is 55 ( 1*32 + 1*16 + 0*8 + 1*4 + 1*2 + 1*1 )
		// for & and it will be              0   0   0   1   1   0 total is 6  ( 0*32 + 0*16 + 0*8 + 1*4 + 1*2 + 0*1 )
		// for ^ XOR it will be              1   1   0   0   0   1 total is 49 ( 1*32 + 1*16 + 0*8 + 0*4 + 0*2 + 1*1 ), so:
		
		System.out.println(38&23); // 6
		System.out.println(38|23); // 55 
		System.out.println(38^23); // 49
		
		
		System.out.println(~-12);
		System.out.println(Integer.toBinaryString(-21));
		
		System.out.println(76&41); // 8
		System.out.println(76|41); // 109
		System.out.println(76^41); // 101
		
		
		// Now lets talk about minus number's binary representation 
		// In order to find 2's complement, we need to find 1's complement and add 1 
		// same thing if we want to find 4th complement, we find 3's complement and add 1 
		// So how do we find -21 ( minus 21 ) in binary ? Well first we need to find 21 in binary: 
		// 1 for 16, 0 for 8, 1 for 4, 0 for 2 and 1 for 1 so 21 is in binary 10101
		// And we need to inverse it, not reverse so inverse means replace all 1's to 0 and all 0's to 1: 01010
		// and we need to add 1 to that number: 
		
		//       0  1  0  1  0
		// 	+                1
		//       _____________
		
		//       0  1  0  1  1 
		
		// -21 in binary is 01011, how do we check, well if we add -21 and 21 it should be 0 right? so let's add those numbers 
		// binary representation: 21's binary is 10101 and -21's binary is 1011:
		
		//       1  0  1  0  1
		// 	+       1  0  1  1
		//       _____________
		
		//    1  0  0  0  0  0 
											
		// we need to ignore first 1 and count only next 5 0's so we got 00000 which is 0 in decimal. 
	}

}
