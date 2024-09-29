public class ReplacedCharacter {
    // replace a specified character with another character:
    public static void main(String[] args) {
        // original character:
        String str = "good morning";
        // character to be replaced:
        char exchar = 'o';
        char newchar = 'r';
        String newstr = str.replace(exchar,  newchar);
        System.out.println("original string: " +str);
        System.out.println("modified string: " + newstr);
    }
}
