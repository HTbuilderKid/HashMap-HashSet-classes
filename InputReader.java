import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }
    public HashSet<String> getInput()
    {
        System.out.println(">");
        String line = reader.nextLine();
        String[] words = line.split(" ");
        HashSet<String> set = new HashSet<>();
        for(String w : words) {
            set.add(w);
        }
        return set;
    }
}
