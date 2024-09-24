package nassiba_array;

public class ReverseElementArray {
    // print array element in reverse:
    public static void main(String[] args) {
        int[] array= {1,3,4, 6, 7};
        printArrayReverse(array);
    }
    public static void printArrayReverse(int[] array){
           for (int i = array.length - 1; i >=0; i--){
            System.out.print(array[i]+ " ");
        }


        }
    }


