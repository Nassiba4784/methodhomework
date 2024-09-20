package nassiba_method;

public class AlphabetCha {
    // print alphabet letter:
    public void printAlpha(){
        for (char a= 'a'; a <= 'z'; a++){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        AlphabetCha alphabetCha = new AlphabetCha();
        alphabetCha.printAlpha();
    }
}

