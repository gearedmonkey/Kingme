package src;
/**
 * Contains a x,y position that describes where the location of an object is.
 * @author CHICKEN
 *
 */
public class Location {
	private int x;
	private int y;
	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
}
