import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
public class Space {

	//Attributes
	ImageIcon pic;
	Color color;
	boolean passThrough;
	int state;
	ArrayList<Instruction> list;
	Zone nextZone;
	
	public Space(ImageIcon p, Color c, boolean pt, int s) {
		pic = p;
		color = c;
		passThrough = pt;
		state = s;
		list = new ArrayList<Instruction>();
		nextZone = null;
	}
	
	//Methods
	public void setPic(ImageIcon p) {
		pic = p;
	}
	public ImageIcon getPic() {
	return pic;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	public Color getColor() {
	return color;
	}
	public void setPassThrough(boolean pt) {
		passThrough = pt;
	}
	public boolean getPassThrough() {
	return passThrough;
	}
	public void setState(int s) {
		state = s;
	}
	public int getState() {
		return state;
	}
	public void setNextZone(Zone next) {
		nextZone = next;
	}
	public Zone getNextZone() {
	return nextZone;
	}
	
	public void addInstruction(int trig, Space tar, ImageIcon pic, Color c, boolean pass, int sta, boolean newL, int newY, int newX, String snd) {
		Instruction temp = new Instruction(trig, tar, pic, c, pass, sta, newL, newY, newX, snd); 
			list.add(temp);
	}
	public String processInstructions() {
		int initialState = state;
		String soundToPlay = "";
		for(int i = 0; i < list.size() ; i++) {
			if(initialState == list.get(i).getTrigger()) {
				list.get(i).preformAction();
				if(list.get(i).getSound()!= null) {
					soundToPlay = list.get(i).getSound();
				}
			}
		}
		return soundToPlay;
	}
	public int[] getNewLocation(){
		int initialState= state;
		for(int i=0 ; i< list.size() ; i++) {
			if(initialState == list.get(i).getTrigger() && list.get(i).getIfNewLocation()) {
				return list.get(i).getNewPlayerLocation();
			}
		}
		return null;
	}
}


