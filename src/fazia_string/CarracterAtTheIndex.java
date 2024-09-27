package fazia_string;

public class CarracterAtTheIndex {

    public static void main(String[] args) {
        int index= 11;
        String str = "great job";
        if (index >= 0 && index < str.length()) {
            char character = str.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Index out of the length. Please enter a valid index.");
        }


    }

}

