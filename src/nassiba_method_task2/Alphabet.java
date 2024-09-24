package nassiba_method_task2;

public class Alphabet {
    // print alphabet letter:
    public char printalpha(){
        for ( char i= 'a'; i<='z'; i++) {
            System.out.print(i+"  ");
        } return 'i';
    }
    public static void main(String[]args){
        Alphabet alphabet = new Alphabet();
        alphabet.printalpha();
    }
}

