        



        String a1 = "Hello";
        String a2 = a1;
        System.out.println(a1 == a2); // true
        System.out.println(a1.equals(a2)); // true

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); // true

        String k1 = "Hello";
        String k2 = "Hello";
        System.out.println(k1==k2); // true
        System.out.println(k1.equals(k2)); // true
