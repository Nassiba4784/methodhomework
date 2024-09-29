package nassiba_string;

public class ReverseString {
    // gert a return a reverse of given string:
    public static void main(String[] args) {
        String origin = "my name is";
        String reversed = "";
        for (int i = origin.length() - 1; i>= 0; i--){
            reversed = reversed + origin.charAt(i);
        }
        System.out.println(reversed+ " ");
    }
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
    return reversed.reverse().toString();
    }
}

