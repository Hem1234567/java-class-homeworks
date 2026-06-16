public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                System.out.println("First Non-Repeating Character: " + str.charAt(i));
                break;
            }
        }
    }
}