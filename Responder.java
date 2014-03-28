import java.util.HashMap;

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
    private HashMap<String, String> hm;

    private Random aleatorio;
    private ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        hm = new HashMap <>();
        hm.put("averia","Nos pondremos a trabajar en su averia");
        hm.put("conexion", "Arreglaremos esa conexion");
        hm.put("error", "Reinicie el equipo, para ver si remite el error");
        hm.put("factura", "Revisaremos su factura");

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
    public String generateResponse(String entrada)
    {
        String respuesta = "";        
        if(hm.containsKey(entrada) ){
            respuesta = hm.get(entrada);    
        }else{
            int numeroObtenido = aleatorio.nextInt(respuestas.size());
            respuesta = respuestas.get(numeroObtenido); 
        }
        return respuesta;
        
      
  
        /**
         * for(String key: hm.keySet()){
         *      if(entrada.contains(key)){ 
         *           return hm.get(key);
         *      }
         * }
         *  return "That sounds interesting. Tell me more...";
         */
    }
}
