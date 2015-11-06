package org.gnusinpavel.reversestring;

/**
 * Created by user on 21.10.15.
 */
public class Main {
    public static void main(String[] args) {
        String str = "Hello123";
        System.out.println(reverse(str, ""));
    }

    static String reverse(String str, String res) {
        if (str.length() == 0) {
            return res;
        }
        return reverse(str.substring(0, str.length() - 1), res + str.charAt(str.length() - 1));
    }
}
