/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room 
{
    public String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room upExit;
    private Room downExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }
    
    public Room getExit (String direction)
    {
    	if(direction.equals("norte")) {
    		return northExit;
    	}
    	
    	if(direction.equals("sul")) {
    		return southExit;
    	}
    	
    	if(direction.equals("leste")) {
    		return eastExit;
    	}
    	
    	if(direction.equals("oeste")) {
    		return westExit;
    	}
    	
    	if(direction.equals("cima")) {
    		return upExit;
    	}
    	
    	if(direction.equals("baixo")) {
    		return downExit;
    	}
    	
    	else {
    		return null;
    	}
    }
    
    public String getExitString (String currentRoom) {
    	String saida = "Sa�das: ";
        if(northExit != null) {
        	saida += "norte ";
        }
        
        if(eastExit != null) {
        	saida += "leste ";
        }
        
        if(southExit != null) {
        	saida += "sul ";
        }
        
        if(westExit != null) {
        	saida += "oeste ";
        }
        
        if(upExit != null) {
        	saida += "cima ";
        }
        
        if(downExit != null) {
        	saida += "baixo ";
        }
    	return saida;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
        if(up != null)
            upExit = up;
        if(down != null)
            downExit = down;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}