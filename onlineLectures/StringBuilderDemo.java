public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("akash is a good");
        s.append(" boy");

        s.deleteCharAt(0);
        s.reverse();

        String result = s.toString();

        System.out.println(result);
    }
}
