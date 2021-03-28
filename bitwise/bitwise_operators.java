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
		
	}

}
