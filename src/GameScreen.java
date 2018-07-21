import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends JFrame{
		
	//Variables
	public final int HEIGHT = 1000;
	public final int WIDTH = 1000;
	JPanel[][] panel = new JPanel[10][10];
	JLabel l;
	
	//Player Variables
	int playerX;
	int playerY;
	
	//Constructor
	public GameScreen() {
		super();
		playerX = 0;
		playerY = 0;

		setSize(HEIGHT, WIDTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Layout setup
		GridLayout grid = new GridLayout(10,10,0,0);
		setLayout(grid);
		
		//Panel setup
		
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
		l = new JLabel();
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player.png")));
			l.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel[0][0].add(l);
		
		//Other
		setVisible(false);
		addKeyListener(new Movement(this)); 
	}
	void showPlayerMove() {
		l = new JLabel();
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player.png")));
			l.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//panel[playerY][playerX].setBackground(Color.BLUE);
		panel[playerY][playerX].add(l); 
		l.setLocation(playerX, playerY);
		
	}
	
	
	void tryMoveLeft() {
		if(playerX>0) {
			panel[playerY][playerX].setBackground(Color.GRAY);
			playerX -= 1;
			showPlayerMove();
		}
		System.out.println("hi");
	
	}
	void tryMoveRight() {
		if(playerX<9) {
			panel[playerY][playerX].setBackground(Color.GRAY);
			playerX += 1;
			showPlayerMove();

		}
	}
	void tryMoveUp() {
		if(playerY>0) {
			panel[playerY][playerX].setBackground(Color.GRAY);
			playerY -= 1;
			showPlayerMove();

		}
	}
	void tryMoveDown() {
		if(playerY<9) {
			panel[playerY][playerX].setBackground(Color.GRAY);
			playerY += 1;
			showPlayerMove();

		}
	}
}
