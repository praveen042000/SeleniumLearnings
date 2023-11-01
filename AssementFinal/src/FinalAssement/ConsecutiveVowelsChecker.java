package FinalAssement;

import java.util.Scanner;

public class ConsecutiveVowelsChecker {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static boolean hasConsecutiveVowels(String s) {
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            char previous = s.charAt(i - 1);
            if (isVowel(current) && isVowel(previous)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        boolean result = hasConsecutiveVowels(input);
        if (result) {
            System.out.println("Consecutive vowels present");
        } else {
            System.out.println("No consecutive vowels");
        }
    }
}
