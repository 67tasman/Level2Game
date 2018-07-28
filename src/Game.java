public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();

	}

	public Game() {
		View v = new View();
		v.home();
		v.playerSelect();
		/*GameScreen game = new GameScreen(v.getPlayerSelected());
		game.updateScreen();
		game.setVisible(true);*/
	}
}
