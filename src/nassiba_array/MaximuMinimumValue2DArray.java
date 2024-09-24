package nassiba_array;

public class MaximuMinimumValue2DArray {
    // find maximum and minimum value of 2D array:
    public static void main(String[] args) {
      int[][] array ={ {2,5,10},
              {13, 8, 20},
              {2, 25,67,89}};

      int max = array[0][0];
      int min = array[0][0];
      for (int i = 0; i < array.length; i++) {
          for (int e = 0; e < array.length; e++){
            if (array[i][e]> max){
                max = array[i][e];
                System.out.println("maximum value"+max);
            }
            if (array[i][e]<min){
                min = array[i][e];
              }
              System.out.println("minimum value" +min);
          }
      }
        }
}
