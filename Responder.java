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
        String[] slowWords = {"slow", "lag", "sluggish"};
        for(String word : slowWords) {
            responses.put(word, "Try turning off your computer.");
        }
        responses.put("crash", "Call a real tech support.");
        responses.put("error", "What's the error message?");
    }
    
    public String generateResponse(HashSet<String> words)
    {
        int matches = 0;
        String lastMatchResponse = "";
        for(String word : words) {
            if(responses.containsKey(word)) {
                matches++;
                lastMatchResponse = responses.get(word);
            }
        }
        if(matches > 1) {
            return "Well, looks like there are several issues. Let's solve them one by one.";
        } else if(matches == 1) {
            return lastMatchResponse;
        }

        HashSet<String> questionWords = new HashSet<>();
        questionWords.add("why");
        questionWords.add("how");
        questionWords.add("who");
        
        for(String word : words) {
            if(questionWords.contains(word)) {
                return "Alright, give me more details.";
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

