import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {

	void gameScreen(){
		JFrame frame = new JFrame();
		frame.setSize(1000,1000);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setBackground(Color.YELLOW);
		panel.setOpaque(true);
		frame.setVisible(true);
		}
	
}
