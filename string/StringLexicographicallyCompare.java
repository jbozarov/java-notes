public class StringLexicographicallyCompare {

    public static void main(String[] args) {

        System.out.println("A".compareTo("A")); // 0
        System.out.println("A".compareTo("B")); // -1
        System.out.println("A".compareTo("D")); // -3

        System.out.println("C".compareTo("A")); // 2
        System.out.println("A".compareTo("a")); // -32
        System.out.println("Z".compareTo("A")); // 25

        System.out.println("A".compareTo("z")); // -57

    }
}

Lexicographically order goes like: A < B < C ... X < Y < Z < a < b < c ...  < x < y < z
