package nassiba_string;

import java.util.Scanner;

public class PalindromeString {
    // check whether the string is a Palindrome:
    public static void main(String[] args) {
        String name = "school";
        String reverse = "";
        for(int i = name.length()-1; i>= 1; i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.println(name.equals(reverse));
    }
}
