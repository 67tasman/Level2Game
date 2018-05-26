import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {

	void home() {
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);
		frame.setVisible(true);
		JButton button = new JButton();
		JButton button2 = new JButton();
		panel.add(button);

		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(new View().getClass().getResourceAsStream("start.png")));
			button.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void playerSelect() {
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setOpaque(true);
		frame.setVisible(true);
	}

	void gameScreen() {
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setBackground(Color.GREEN);
		panel.setOpaque(true);
		frame.setVisible(true);
	}

}
