package nassiba_string;

public class SpecifiedSequence {
    // test a given string contains the specified sequence of char values:
    public static void main(String[] args) {
        String mainStr = "write a comment below the page";
        String sequence = "comment";
        boolean contains = mainStr.contains(sequence);
        System.out.println("main String: "  + mainStr );
    System.out.println("sequence: " + sequence );
        System.out.println("Contains sequence? " + contains);
    }
}
