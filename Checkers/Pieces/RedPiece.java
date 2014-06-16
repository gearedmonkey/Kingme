package Pieces;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import src.Location;

public class RedPiece extends Piece{
	Location loc;
	ImageIcon ic;
	
	public RedPiece(int xLoc, int yLoc){
		loc = new Location(xLoc,yLoc);
		ic = new ImageIcon("/Kingme/Checkers/Assets/redIC.png");
	}
	/**
	 * TODO
	 */
	public ArrayList<Location> getMoveLocations() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Sets the pieces location to a new location on the grid
	 * @param newX X coordinate of new Location 
	 * @param newY Y coordinate of new Location
	 */
	public void setLocation(int newX, int newY) {
		loc.setX(newX);
		loc.setY(newY);
	}
	/**
	 * Returns the current Location of this piece
	 */
	public Location getLocation() {
		
		return this.loc;
	}


}
