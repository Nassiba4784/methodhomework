package nassiba_method_task2;

public class DivisbleNumber {
    // print numbers divisible by 3 & 5 from 0-100:
    public void printnumber(int s, int e) {
        for (int i = 0; i <= 100; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
    }
    public static void main(String[]args){
        DivisbleNumber divisibleNumber = new DivisbleNumber();
        divisibleNumber.printnumber(0,99);
    }
}

