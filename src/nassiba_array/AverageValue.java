package nassiba_array;

public class AverageValue {
    // calculate the average value:
    public static int calculateaverage() {
        double arr[] = {4.2, 9.1, 10.6, 5.1};
        double total = 0;
        double avrg;
        for (int i = 0; i < arr.length; i++) {

            total = total + arr[i];
        }
        avrg = total / arr.length;

        return (int) (total/arr.length);
    }
    public static void main(String[]args) {

        AverageValue averageValue = new AverageValue();
        double avrg = AverageValue.calculateaverage();
        System.out.println(avrg);
    }
}

