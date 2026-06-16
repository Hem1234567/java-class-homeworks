public class ReverseEachWord1 {
    public static void main(String[] args) {
        String text = "java is easy";

        String[] words = text.split(" ");

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}