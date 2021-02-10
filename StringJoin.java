public class StringJoinDemo {
    public static void main(String[] args) {
        List<String> messages = List.of("I love you", "I want to buy a phone", "I need to take a break", "I need to talk to my boss about ...");
        String joined = String.join("\n", messages);
        System.out.println(joined);
    }
}
