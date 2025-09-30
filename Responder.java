import java.util.HashMap;
import java.util.HashSet;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> responses;
    private String lastDefaultResponse;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new HashMap<>();
        lastDefaultResponse = "";
        responses.put("slow", "Try turning off your computer.");
        responses.put("crash", "Call a real tech support.");
        responses.put("error", "What's the error message?");
    }
    
    public String generateResponse(HashSet<String> words)
    {
        for(String word : words) {
            if(responses.containsKey(word)) {
                return responses.get(word);
            }
        }
        String default1 = "Could you be more specific?";
        String default2 = "Please explain in more detail.";
        
        if(lastDefaultResponse.equals(default1)) {
            lastDefaultResponse = default2;
        } else {
            lastDefaultResponse = default1;
        }
        return lastDefaultResponse;
    }
}

