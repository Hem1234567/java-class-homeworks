public class StringTest {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.toString());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
    }
}