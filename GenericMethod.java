public class GenericMethod {

    public <T> void showItem(T t) {
        System.out.println("Item is " + t.toString());
    }


    public <T> T foo(T t) {
        System.out.println(t.toString());
        return t;
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.showItem("Jahongir");
        genericMethod.showItem(12);
        genericMethod.showItem(12.23);
        genericMethod.showItem('U');


        genericMethod.foo("Jahongir");
        genericMethod.foo(12);
        genericMethod.foo('I');
    }
}
