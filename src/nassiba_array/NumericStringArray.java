package nassiba_array;

import java.util.Arrays;

public class NumericStringArray {
    // sort numeric array and string array:
    public static void main(String[]args){
        // sort numeric array:
        int[] numbers = {2, 4, 5, 9};
        Arrays.sort(numbers);
        System.out.println("sorted numeric array");
        for (int N : numbers){
            System.out.println(N+ " ");
        }
        // sort string array:
        String[] names = {"nassi", "fazi", "mell"};
        Arrays.sort(names);
        System.out.println("sorted string array");
        for (String name : names){
            System.out.println(name+ " ");
        }
    }
}

