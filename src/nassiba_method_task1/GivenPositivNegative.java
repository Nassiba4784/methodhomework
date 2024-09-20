package nassiba_method;

public class GivenPositivNegative {
    // check the given number positive or negative
    public int getpostivenegative(int a) {
        if (a > 0) {
            System.out.println( a + "is positive");
        } else {
            System.out.println(a + "is negative");
        }
        return a;
    }
    public static void main(String[] args) {
        GivenPositivNegative givenNumpositivNegativ = new GivenPositivNegative();
        System.out.println(givenNumpositivNegativ.getpostivenegative(10));

    }
}

