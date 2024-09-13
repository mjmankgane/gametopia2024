import java.util.*;

/**
  * Encapsulates the details of the player in a game.
  */
class player {
	
    private List<String> parts; // List of parts of the bridge 

    public player(String[] initialParts) {
        parts = new LinkedList<>();
        for (int k = 0; k < initialParts.length; k++)
            parts.add(initialParts[k]);
    } // constructor

    /** Get a description of the position of each part of player's bridge at a time.
      */
    public String getParts() {
        return String.format("Your bridge design (by parts) is: %s.\n", parts);
    } // getParts
    
    /** Remove a part from the player's bridge design.
      */
    public void removePart(String part) throws Exception {
        if (!parts.contains(part)) {
            throw new Exception("There are no parts to remove on your bridge design.");
        }
        parts.remove(part);
    } // removePart

    /** Add a part to the player's bridge design.
      */
    public void addPart(String part) {
        parts.add(part);
    } // addPart

    /** Tell whether a part is on the player's bridge design or not.
      */
    public boolean hasPart(String t) {
        return parts.contains(t);
    } // hasPart
} // class player