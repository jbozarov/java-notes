import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        Iterator<Integer> some = numbersList.iterator();
        some.forEachRemaining(System.out::println); // 1 2 3 4 5
        while (some.hasNext()) {
            System.out.println(some.next() + " hello");
        }

        Collection values = new ArrayList();
        values.add(12);
        values.add("hello");
        values.add(true);
        values.add(12.2);

        System.out.println(values); // [12, hello, true, 12.2]
        System.out.println(values.size()); // 4
        System.out.println(values.add(13)); // true
        System.out.println(values.remove(13)); // true
        System.out.println(values.remove(16)); // false because it does not exist

        Iterator collectionIterator = values.iterator();
        while (collectionIterator.hasNext()) {
            System.out.println(collectionIterator.next());
        }

    }
}
