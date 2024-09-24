package nassiba_method_task1;

public class AlphabetCha {
    // print alphabet character:
    public boolean findalphabet(char i) {
        if (i >= 'a' && i <= 'z') {
            boolean c = true;
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[]args){
        AlphabetCha alphaChar = new AlphabetCha();
        System.out.println(alphaChar.findalphabet('4'));

    }
}

