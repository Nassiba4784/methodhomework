package nassiba_method_task2;

public class DisplayFirst10 {
    // display 10 first natural numbers:
    public void getfirst10(int i) {
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        DisplayFirst10 displayFirst10 = new DisplayFirst10();
        displayFirst10.getfirst10(8);
    }
}
