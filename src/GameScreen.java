import java.awt.Color;
import java.awt.GridLayout;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends JFrame{
		
	//Constants
	public final int HEIGHT = 200;
	public final int WIDTH = 300;
	
	public GameScreen() {
		super();
		
		setSize(HEIGHT, WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Layout setup
		GridLayout grid = new GridLayout(2,2,0,0);
		setLayout(grid);
		
		//Panel setup
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p2.setBackground(Color.BLUE);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.green);
		JPanel p4 = new JPanel();
		p4.setBackground(Color.CYAN);
		
		//Adding Panels
		add(p1); 
		add(p2);
		add(p3);
		add(p4);
		
		//Other
		setVisible(true);
		
	}
}
