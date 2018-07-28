import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.css.RGBColor;

public class View implements ActionListener {
	JButton startButton = new JButton();
	JFrame homeFrame = new JFrame();
	JButton Player1Button = new JButton();
	JButton Player2Button = new JButton();
	JButton Player3Button = new JButton();
	JButton Player4Button = new JButton();
	JFrame playerSelectFrame = new JFrame();
	JPanel player = new JPanel();
	ImageIcon playerSelected;

	// GameScreen gameFrame = new GameScreen();
	void home() {
		homeFrame.setSize(1000, 1000);
		JPanel panel = new JPanel();
		homeFrame.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);
		homeFrame.setVisible(true);
		startButton.addActionListener(this);
		// JButton button2 = new JButton();
		panel.setLayout(null);
		panel.add(startButton);
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("start.png")));
			startButton.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startButton.setBounds(275, 350, 450, 150);

	}

	void playerSelect() {
		Font font = new Font(Font.DIALOG_INPUT, Font.CENTER_BASELINE, 80);
		playerSelectFrame.setSize(1000, 1000);
		JPanel panel = new JPanel();
		playerSelectFrame.add(panel);
		panel.setBackground(new Color(0, 0, 0));
		panel.setOpaque(true);
		JLabel label = new JLabel("           Player Select                           \n");
		label.setFont(font);
		label.setForeground(Color.ORANGE);
		panel.add(label);
		Player1Button.addActionListener(this);
		Player2Button.addActionListener(this);
		Player3Button.addActionListener(this);
		Player4Button.addActionListener(this);
		panel.add(Player1Button);
		panel.add(Player2Button);
		panel.add(Player3Button);
		panel.add(Player4Button);
		playerSelectFrame.setVisible(false);
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player.png")));
			Player1Button.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player2.png")));
			Player2Button.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player3.png")));
			Player3Button.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ImageIcon icon = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("player4.png")));
			Player4Button.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * void gameScreen() { gameFrame.setSize(1000, 1000); JPanel panel = new
	 * JPanel(); gameFrame.add(panel); panel.setBackground(Color.GREEN);
	 * panel.setOpaque(true); gameFrame.setVisible(false);
	 * 
	 * }
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (startButton == e.getSource()) {
			playerSelectFrame.setVisible(true);
			homeFrame.dispose();
		}
		if (Player1Button == e.getSource()) {
			playerSelected = (ImageIcon) Player1Button.getIcon();
			playerSelectFrame.dispose();
			startGame();

		}
		if (Player2Button == e.getSource()) {
			playerSelected = (ImageIcon) Player2Button.getIcon();
			playerSelectFrame.dispose();
			startGame();

		}
		if (Player3Button == e.getSource()) {
			playerSelected = (ImageIcon) Player3Button.getIcon();
			playerSelectFrame.dispose();
			startGame();

		}
		if (Player4Button == e.getSource()) {
			playerSelected = (ImageIcon) Player4Button.getIcon();
			playerSelectFrame.dispose();
			startGame();

		}

	}

	ImageIcon getPlayerSelected() {
		return playerSelected;
	}
	void startGame() {
		GameScreen game = new GameScreen(playerSelected);
		
	}
}