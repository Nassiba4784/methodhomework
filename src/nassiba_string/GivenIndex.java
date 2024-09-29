package nassiba_string;

import java.rmi.activation.ActivationGroup_Stub;

public class GivenIndex {
    // character at5 the given index within string:
    public static void main(String[] args) {
        String str = "comment";
        int index = 5;
        if (index >= 0 && index < str.length()){
            char ch = str.charAt(index);
            System.out.println("character at index " + index + " is: " + ch);

       } else {
            System.out.println("index is out of bound for given string");
        }
    }
}
