import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;
    private HashSet<String> hs;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
        hs = new HashSet<>();
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        hs.clear(); //Limpiamos el HashSet
        String inputLine = reader.nextLine();
        inputLine = inputLine.toLowerCase().trim(); //minúsculas y espacios no
        String[] entradas = inputLine.split(" ");
        //inputLine = entradas[0];
        for(int i = 0; i < entradas.length; i++){
            hs.add(entradas[i]);
        }
        return hs;
    }
}
