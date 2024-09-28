package fazia_string;

public class ReplaceACharacter {
    public static void main(String[] args) {
    String str= " i closed my bank account";
    char originalChar = 'a';
    char newChar= 'z';
    String str2= str.replace(originalChar,newChar);
    System.out.println(str2);
}
}


