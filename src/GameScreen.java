import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends JFrame{
		
	//Constants
	public final int HEIGHT = 1000;
	public final int WIDTH = 1000;
	
	public GameScreen() {
		super();
		
		setSize(HEIGHT, WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Layout setup
		GridLayout grid = new GridLayout(10,10,0,0);
		setLayout(grid);
		
		//Panel setup
	
		JPanel[][] panel = new JPanel[10][10];
		for(int i = 0 ; i<10 ; i++) {
			for(int a = 0 ; a<10 ; a++) {
				panel[i][a]= new JPanel();
				panel[i][a].setBackground(Color.GRAY);
			}
		}
		
		
		
		//Adding Panels
		for(int i = 0 ; i<10 ; i++) {
			for(int a = 0 ; a<10 ; a++) {
				add(panel[i][a]);
			}
		}
		
		//Creating labels
		JLabel l = new JLabel();
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("rock.png")));
			l.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel[0][0].add(l);
		
		//Other
		setVisible(false);
		
	}
}
