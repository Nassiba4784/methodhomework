package nassiba_method;

public class LargestNumber {
    // largest number:
    public int getLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        System.out.println(largestNumber.getLargest(10, 7));
    }
}


