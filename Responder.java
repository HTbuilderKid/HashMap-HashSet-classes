import java.util.HashMap;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new HashMap<>();
        fillResponsesMap();
    }
    
    private void fillResponsesMap()
    {
        responses.put("slow", "Try turning off your computer.");
        responses.put("crash", "You're gonna have to call a real tech support.");
        responses.put("slow", "What's the error message?");
        responses.put("slow", "Check whether your monitor is plugged in properly.");
        responses.put("slow", "Unpair and pair the device again.");
        responses.put("slow", "Turn if off and then back on, and check if airplane mode is turned off.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String response = responses.get(word.toLowerCase());
        if(responses != null) {
            return response;
        } else {
            return pickDefaultResponse();
        }
    }
    
    private String pickDefaultResponse()
    {
        return "Could you be more specific?";
    }
}

