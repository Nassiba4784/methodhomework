package nassiba_array;

public class SumValueOfInteger {
    // count sum values:

    static int arr[] = {7, 15, 39, 67};
    static int sum() {
        int sum = 0;
        for (int i=0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }
    public static void main(String[]args) {
        System.out.println("sum of given array is" + sum());
    }
}


