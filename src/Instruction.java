import java.awt.Color;

import javax.swing.ImageIcon;

public class Instruction {

	//Atributes
	int trigger;
	Space target;
	ImageIcon newPic;
	Color newColor;
	boolean newPassThrough;
	int newState;
	boolean newLocation;
	int newPlayerX;
	int newPlayerY;
	String sound;
	
	//Constructor
	public Instruction(int trig, Space tar, ImageIcon pic, Color c, boolean pass, 
			int sta, boolean newL, int newY, int newX, String snd) {
		trigger = trig;
		target = tar;
		newPic = pic;
		newColor = c;
		newPassThrough = pass;
		newState = sta;
		newLocation = newL;
		newPlayerX = newX;
		newPlayerY = newY;
		sound = snd;
	}
	
	public boolean getIfNewLocation() {
		return newLocation;
	}
	
	public int[] getNewPlayerLocation() {
		if (newLocation) {
			int[] locationArray = new int[2];
			locationArray[0]= newPlayerY;
			locationArray[1] = newPlayerX;
			return locationArray;	
		}
		else return null;
	}
	//Methods
	public int getTrigger() {
		return trigger;
	}
	public void preformAction() {
		target.setPic(newPic);
		target.setColor(newColor);
		target.setPassThrough(newPassThrough);
		target.setState(newState);
	}
	public String getSound() {
		return sound;
	}
}
