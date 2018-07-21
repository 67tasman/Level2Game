import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Zone {

	//Attributes
	int dimensions;
	Space[][] spaces;
	int playerStartX;
	int playerStartY;
	int enemyStartX;
	int enemyStartY;
	
	//Images
	ImageIcon player;
	ImageIcon player2;
	ImageIcon player3;
	ImageIcon rock;
	ImageIcon portal;
	//Constructor
	public Zone(int d) {
		dimensions = d;
		spaces = new Space[10][10];
		playerStartX = 0;
		playerStartY = 0;
		enemyStartX = -1;
		enemyStartY = -1;
		
		//Loads images into Image variables
		try {
			player = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player.png")));
			player2 = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player2.png")));
			rock = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("rock.png"))); 
			portal = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("portal.gif"))); 
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Methods
	
	//Player
	public void setPlayerStartX(int x) {
		playerStartX = x;
	}
	
	public int getPlayerStartX() {
		return playerStartX;
	}
	
	public void setPlayerStartY(int y) {
		playerStartX = y;
	}
	
	public int getPlayerStartY() {
		return playerStartY;
	}
	
	//Enemy
	public void setEnemyStartX(int x) {
		enemyStartX = x;
	}
	
	public int getEnemyStartX() {
		return enemyStartX;
	}
	public void setEnemyStartY(int y) {
		enemyStartY = y;
	}
	
	public int getEnemyStartY() {
		return enemyStartY;
	}
	
	//Space
	public Space getSpace(int y, int x) {
		return spaces[y][x];
	}
	
	public Space[][] getSpaceGrid(){
		return spaces;
	}
	
	//This method is defined in child classes.
	public void enableZoneWarpSpaces() {
		
	}
}
