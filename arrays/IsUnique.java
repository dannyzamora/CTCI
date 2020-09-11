package arrays;

import java.util.Arrays;

/**
 * IsUnique
 */
public class IsUnique {

    public static void checker(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println(val);
            if ((c & (1 << val)) > 0) {
                System.out.println("Duplicates found");
                return;
            }
            c |= (1 << val);
        }
        System.out.println("WE MADE IT");
    }

    public static void main(String[] args) {
        String str = "aba";
        char[] chararry = str.toCharArray();

        Arrays.sort(chararry);
        checker(str);
        for (int i = 0; i < str.length() - 1; i++) {
            if (chararry[i] == chararry[i + 1]) {
                System.out.println("Duplicates found");
                return;
            }
        }
        System.out.println("WE MADE IT");

    }
}