

public class StringImmutable {
  
      public static void main(String[] args) {
  
        
        String s1 = "Hello World";
        String s2 = "Hello World";

        System.out.println(s1.equals(s2)); // true checks only value
        System.out.println(s1 == s2); // true both s1 and s2 literal are pointing to the same object


        
        
        String s3 = new String("Hello World");
        String s4 = "Hello World";

        System.out.println(s3.equals(s4)); // true checks only value
        System.out.println(s3 == s4); // false both s3 and s4 literal are pointing to different obj

        
        
        
        String s5 = new String("Hello World");
        String s6 = new String("Hello World");

        System.out.println(s5.equals(s6)); // true checks only value
        System.out.println(s5 == s6); // false both are different object because we are using new keyword 
    }

}

