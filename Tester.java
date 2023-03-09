import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // sample test for the includes method
        System.out.println("\nTesting includes method...");
        boolean result = Wordle.includes("hello", 'e');
        System.out.println("includes(\"hello\", 'e') returns " + result);
        System.out.println(Wordle.isAlpha("Hello!"));
        System.out.println(Wordle.numInSamePosn('a', "java", "mama"));
        System.out.println(Wordle.processGuess("stain", "edict"));

        // Add additional tests below to ensure that your methods
        // work correctly.

        console.close();
    }
}
