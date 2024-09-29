package fazia_string;

public class NumberOfCharacter {
    public static void main(String[] args) {
        String sentence = " My Name is Fazia Mebrek I am very nice Lady";
        int count  = 0;
        for (int i =0;i<sentence.length();i++ ) {
            if (sentence.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(" the number of character is: " +count);
    }
}




