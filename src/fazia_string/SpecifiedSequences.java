package fazia_string;

public class SpecifiedSequences {

    public static void main(String[] args) {

        String str = "Hello Everyone";
        String str1 = "heloo";

        // check if name is present in txt
        // using contains()
        boolean result = str.contains(str1);
        if (result) {
            System.out.println(str1 + " is present in the string.");
        } else {
            System.out.println(str1 + " is not present in the string.");
        }
    }
}
