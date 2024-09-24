package nassiba_array;

public class MaxMinValue {
    //  find the maximum and minimum value of an array:
    public static void main(String[]args) {
        int[] numbers = {5, 7, 0, 26, 73, -91};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            System.out.println(max);
            {
                min = numbers[i];
            }
            System.out.println(min);
        }
    }
}
