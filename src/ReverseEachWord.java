import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

        sc.close();
    }
}