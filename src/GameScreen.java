import java.awt.GridLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends JFrame {

	// Frame Attributes
	public final int WINDOW_HEIGHT = 1000;
	public final int WINDOW_WIDTH = 1000;
	public final int DIMENSIONS = 10;

	// Audio Player
	AudioPlayer musicPlayer = new AudioPlayer();
	AudioPlayer soundPlayer = new AudioPlayer();
	// Player Attributes
	private int playerX;
	private int playerY;
	private ImageIcon playerPic;

	// Enemy Attributes
	private int enemyX;
	private int enemyY;
	private ImageIcon enemyPic;

	// Zone Attributes
	private Zone currentZone;

	// Panel Grid
	JPanel[][] panels = new JPanel[DIMENSIONS][DIMENSIONS];

	// Label Grid
	private JLabel[][] labels = new JLabel[DIMENSIONS][DIMENSIONS];

	// Constructor
	public GameScreen(ImageIcon playerImage) {
		super();

		// Frame Setup
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		// Layout setup
		GridLayout grid = new GridLayout(10, 10, 0, 0);
		setLayout(grid);

		// Zone Setup
		currentZone = new Zone1(DIMENSIONS, 0, 0, 9, 0);
		currentZone.enableZoneWarpSpaces();

		// Player setup
		playerX = currentZone.getPlayerStartX();
		playerY = currentZone.getPlayerStartY();
		playerPic = playerImage;
		// Enemy setup
		enemyX = currentZone.getEnemyStartX();
		enemyY = currentZone.getEnemyStartY();
		try {
			enemyPic = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("rockmonster.gif")));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// Panel setup

		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				panels[i][a] = new JPanel();

			}
		}

		// Adding labels to the panels
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				labels[i][a] = new JLabel();
				panels[i][a].add(labels[i][a]);

			}
		}

		// Adding panels to the frame
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				add(panels[i][a]);
			}

		}

		// Updates Panels/Labels/player graphics
		updateScreen();

		// Other
		setVisible(true);
		addKeyListener(new Movement(this));
		// starting background music
		musicPlayer.play(currentZone.getBackgroundMusic(), 100);
	}

	void updateScreen() {

		// Make Zone Change if necessary
		Zone possibleNewZone = currentZone.getSpace(playerY, playerX).getNextZone();
		if (possibleNewZone != null) {
			String oldBGMusic = currentZone.getBackgroundMusic();
			currentZone = possibleNewZone;
			currentZone.enableZoneWarpSpaces();
			playerX = currentZone.getPlayerStartX();
			playerY = currentZone.getPlayerStartY();
			enemyX = currentZone.getEnemyStartX();
			enemyY = currentZone.getEnemyStartY();

			if (!oldBGMusic.equals(currentZone.getBackgroundMusic())) {
				musicPlayer.stop();
				musicPlayer.play(currentZone.getBackgroundMusic(), 100);
			}
		}

		// Update Panel Colors
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				panels[i][a].setBackground(currentZone.getSpace(i, a).getColor());
			}
		}

		// Update Labels
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {

				labels[i][a].setIcon(currentZone.getSpace(i, a).getPic());
			}
		}
		// Shows player in the new space
		labels[playerY][playerX].setIcon(playerPic);

		// Shows enemy in the new space
		// labels[enemyY][enemyX].setIcon(enemyPic);
	}

	void tryMoveLeft() {

		if (playerX > 0) {
			int targetX = playerX - 1;
			int targetY = playerY;

			if (currentZone.getSpace(targetY, targetX).getPassThrough()) {

				playerX -= 1;
				// enemyMove();
			}
			checkPlayerWarp(targetY, targetX);
			String sound = currentZone.getSpace(targetY, targetX).processInstructions();
			updateScreen();
			if (!sound.equals("")) {
				soundPlayer.play(sound, 1);
			}
		}

	}

	void tryMoveUp() {

		if (playerY > 0) {
			int targetX = playerX;
			int targetY = playerY - 1;

			if (currentZone.getSpace(targetY, targetX).getPassThrough()) {

				playerY -= 1;
				// enemyMove();
			}
			checkPlayerWarp(targetY, targetX);
			String sound = currentZone.getSpace(targetY, targetX).processInstructions();
			updateScreen();
			if (!sound.equals("")) {
				soundPlayer.play(sound, 1);
			}
		}

	}

	void tryMoveRight() {

		if (playerX < DIMENSIONS - 1) {
			int targetX = playerX + 1;
			int targetY = playerY;

			if (currentZone.getSpace(targetY, targetX).getPassThrough()) {

				playerX += 1;
				// enemyMove();
			}
			checkPlayerWarp(targetY, targetX);
			String sound = currentZone.getSpace(targetY, targetX).processInstructions();
			updateScreen();
			if (!sound.equals("")) {
				soundPlayer.play(sound, 1);
			}
		}

	}

	void tryMoveDown() {

		if (playerY < DIMENSIONS - 1) {
			int targetX = playerX;
			int targetY = playerY + 1;

			if (currentZone.getSpace(targetY, targetX).getPassThrough()) {

				playerY += 1;
				// enemyMove();
			}
			checkPlayerWarp(targetY, targetX);
			String sound = currentZone.getSpace(targetY, targetX).processInstructions();
			updateScreen();
			if (!sound.equals("")) {
				soundPlayer.play(sound, 1);
			}
		}

	}

	public void checkPlayerWarp(int y, int x) {
		Space currentSpace = currentZone.getSpace(y, x);
		int[] newPlayerLocation = currentSpace.getNewLocation();
		if (newPlayerLocation != null) {
			playerY = newPlayerLocation[0];
			playerX = newPlayerLocation[1];
		}
	}

}
