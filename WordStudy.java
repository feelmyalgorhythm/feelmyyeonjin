import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String s = sc.next();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A']++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                arr[s.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        char ch = '?';

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
