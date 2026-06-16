public class Reverse_string {
    public static void main(String[] args) {
        String str = "this is java class";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}