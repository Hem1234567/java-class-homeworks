public class Vowel {
    public static void main(String[] args) {
        String a = "this is java class";
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("There are " + count + " vowels");
    }
}