package nassiba_array;

public class ElementOf2DArray {
// Print element of 2D array:
public static void main(String[] args) {
    int[][] array = {{2,1,5}, {4,10,19},{40, 7, 15}};
    for (int i = 0; i< array.length; i++){
        for (int e = 0; e < array.length; e++){
            System.out.println(array[i][e]+" ");

        }
    }
}
}
