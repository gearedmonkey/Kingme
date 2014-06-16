package Pieces;

import java.util.ArrayList;

import src.Location;


/**
 * Describes the base functionality of a piece that is present on the board.<p>
 * @author CHICKEN
 *
 */
public abstract class Piece {
	char team;
	/**
	 * Returns all possible locations that this piece can move to.
	 * @return 
	 */
	abstract ArrayList<Location> getMoveLocations();
	abstract void setLocation(int newX, int newY);
	abstract Location getLocation();
	
}	
