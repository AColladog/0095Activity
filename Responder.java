import java.util.HashMap;
import java.util.*;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{   
    private HashMap<String, String> hm;
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
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String entrada)
    {   
        for(String key: hm.keySet()){
            if(entrada.contains(key)){                
                return hm.get(key); 
            }
        }
        
       /* if(hm.containsKey(entrada) ){
            return hm.get(entrada);    
        }*/        
        return "That sounds interesting. Tell me more...";
    }
}
