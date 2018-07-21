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
	
	//Constructor
	public Instruction(int trig, Space tar, ImageIcon pic, Color c, boolean pass, int sta) {
		trigger = trig;
		target = tar;
		newPic = pic;
		newColor = c;
		newPassThrough = pass;
		newState = sta;
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
}
