import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movement implements KeyListener{
//Variables
	GameScreen screen;
//Constructor 
	public Movement(GameScreen gs) {
		screen = gs;
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int currentCode = arg0.getKeyCode();
		
		if(currentCode == 65 || currentCode == 37 ) { //a or left
			screen.tryMoveLeft();
		}
		if(currentCode == 87 || currentCode == 38 ) { //w or up
			screen.tryMoveUp();
		}
		if(currentCode == 68 || currentCode == 39 ) { //d or right
			screen.tryMoveRight();
		}
		if(currentCode == 83 || currentCode == 40 ) { //s or down
			screen.tryMoveDown();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
