import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("Me parece serio");
        respuestas.add("Nos pondremos con ello");
        respuestas.add("Reinicie el equipo");
        respuestas.add("Problemas en el pago");
        respuestas.add("Me gustaría poder ayudarle");
        respuestas.add("No se enfade");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroObtenido = aleatorio.nextInt(respuestas.size());
        return respuestas.get(numeroObtenido);
    }
}
