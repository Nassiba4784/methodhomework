package nassiba_method_task2;

public class AverageNumber {
    // get the average of all natural numbers between 2 and 8:
    public int getavg(int start, int end) {
        int sum = 0;
        int total = 7;
        for (int i = 2; i <= 8; i++) {
            sum = sum + i;
            int avg = sum / 7;
        }
        return 'i';
    }
    public static void main(String[] args) {
        AverageNumber averageNumber = new AverageNumber();
        int avg = averageNumber.getavg(2, 8);

    }

}