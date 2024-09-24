package nassiba_array;

public class SumElement2DArray {
    // calculate sum of all elements in a 2D array:
    public static void main(String[] args) {
        int[][] array = {{1, 5,17}, {10, 37, 40}};
int sum = 0;
for (int row = 0; row < array.length; row++){
    for(int coln = 0; coln< array.length; coln++){
        sum = sum + array[row][coln];

        System.out.println("sum element in the 2D array" +sum);
    }

}
    }
}
