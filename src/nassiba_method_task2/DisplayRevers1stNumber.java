package nassiba_method_task2;

public class DisplayRevers1stNumber {
    //display 10 first natural numbers in reverse:
    public void desreversnum() {
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        DisplayRevers1stNumber displayFirstNum = new DisplayRevers1stNumber();
        displayFirstNum.desreversnum();
    }
}
