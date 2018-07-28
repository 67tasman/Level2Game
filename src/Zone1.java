import java.awt.Color;

public class Zone1 extends Zone {
	// Attributes
Color color = new Color(79,69,66);
	// Constructors
	public Zone1(int dimensions, int pY, int pX, int eY, int eX) {
		super(dimensions);

		// player start
		playerStartX = pX;
		playerStartY = pY;

		// Enemy Start
		enemyStartX = eX;
		enemyStartY = eY;

		//                      object  color  passable? state
		// Set up row 0
		spaces[0][0] = new Space(null, color, true, 0);
		spaces[0][1] = new Space(null, color, true, 0);
		spaces[0][2] = new Space(null, color, true, 0);
		spaces[0][3] = new Space(null, color, true, 0);
		spaces[0][4] = new Space(null, color, true, 0);
		spaces[0][5] = new Space(null, color, true, 0);
		spaces[0][6] = new Space(null, color, true, 0);
		spaces[0][7] = new Space(skulls, color, false, 0);
		spaces[0][8] = new Space(null, color, true, 0);
		spaces[0][9] = new Space(rock, color, false, 0);

		// Set up row 1
		spaces[1][0] = new Space(null, color, true, 0);
		spaces[1][1] = new Space(null, color, true, 0);
		spaces[1][2] = new Space(null, color, true, 0);
		spaces[1][3] = new Space(null, color, true, 0);
		spaces[1][4] = new Space(null, color, true, 0);
		spaces[1][5] = new Space(null, color, true, 0);
		spaces[1][6] = new Space(null, color, true, 0);
		spaces[1][7] = new Space(rock, color, false, 0);
		spaces[1][8] = new Space(null, color, true, 0);
		spaces[1][9] = new Space(null, color, true, 0);
		// Set up row 2
		spaces[2][0] = new Space(null, color, true, 0);
		spaces[2][1] = new Space(null, color, true, 0);
		spaces[2][2] = new Space(null, color, true, 0);
		spaces[2][3] = new Space(null, color, true, 0);
		spaces[2][4] = new Space(null, color, true, 0);
		spaces[2][5] = new Space(rock, color, false, 0);
		spaces[2][6] = new Space(null, color, true, 0);
		spaces[2][7] = new Space(null, color, true, 0);
		spaces[2][8] = new Space(null, color, true, 0);
		spaces[2][9] = new Space(null, color, true, 0);
		// Set up row 3
		spaces[3][0] = new Space(null, color, true, 0);
		spaces[3][1] = new Space(null, color, true, 0);
		spaces[3][2] = new Space(null, color, true, 0);
		spaces[3][3] = new Space(null, color, true, 0);
		spaces[3][4] = new Space(null, color, true, 0);
		spaces[3][5] = new Space(null, color, true, 0);
		spaces[3][6] = new Space(null, color, true, 0);
		spaces[3][7] = new Space(null, color, true, 0);
		spaces[3][8] = new Space(rock, color, false, 0);
		spaces[3][9] = new Space(null, color, true, 0);
		// Set up row 4
		spaces[4][0] = new Space(rock, color, false, 0);
		spaces[4][1] = new Space(null, color, true, 0);
		spaces[4][2] = new Space(null, color, true, 0);
		spaces[4][3] = new Space(null, color, true, 0);
		spaces[4][4] = new Space(null, color, true, 0);
		spaces[4][5] = new Space(null, color, true, 0);
		spaces[4][6] = new Space(null, color, true, 0);
		spaces[4][7] = new Space(null, color, true, 0);
		spaces[4][8] = new Space(null, color, true, 0);
		spaces[4][9] = new Space(rock, color, false, 0);
		// Set up row 5
		spaces[5][0] = new Space(null, color, true, 0);
		spaces[5][1] = new Space(rock, color, false, 0);
		spaces[5][2] = new Space(null, color, true, 0);
		spaces[5][3] = new Space(null, color, true, 0);
		spaces[5][4] = new Space(null, color, true, 0);
		spaces[5][5] = new Space(null, color, true, 0);
		spaces[5][6] = new Space(null, color, true, 0);
		spaces[5][7] = new Space(null, color, true, 0);
		spaces[5][8] = new Space(null, color, true, 0);
		spaces[5][9] = new Space(null, color, true, 0);
		// Set up row 6
		spaces[6][0] = new Space(null, color, true, 0);
		spaces[6][1] = new Space(null, color, true, 0);
		spaces[6][2] = new Space(pillar, color, false, 0);
		spaces[6][3] = new Space(null, color, true, 0);
		spaces[6][4] = new Space(null, color, true, 0);
		spaces[6][5] = new Space(null, color, true, 0);
		spaces[6][6] = new Space(null, color, true, 0);
		spaces[6][7] = new Space(rock, color, false, 0);
		spaces[6][8] = new Space(null, color, true, 0);
		spaces[6][9] = new Space(null, color, true, 0);
		// Set up row 7
		spaces[7][0] = new Space(pillar, color, false, 0);
		spaces[7][1] = new Space(null, color, true, 0);
		spaces[7][2] = new Space(null, color, true, 0);
		spaces[7][3] = new Space(null, color, true, 0);
		spaces[7][4] = new Space(null, color, true, 0);
		spaces[7][5] = new Space(null, color, true, 0);
		spaces[7][6] = new Space(null, color, true, 0);
		spaces[7][7] = new Space(null, color, true, 0);
		spaces[7][8] = new Space(portal, color, true, 0);
		spaces[7][9] = new Space(null, color, true, 0);
		// Set up row 8
		spaces[8][0] = new Space(null, color, true, 0);
		spaces[8][1] = new Space(pillar, color, false, 0);
		spaces[8][2] = new Space(null, color, true, 0);
		spaces[8][3] = new Space(null, color, true, 0);
		spaces[8][4] = new Space(null, color, true, 0);
		spaces[8][5] = new Space(null, color, true, 0);
		spaces[8][6] = new Space(null, color, true, 0);
		spaces[8][7] = new Space(null, color, true, 0);
		spaces[8][8] = new Space(null, color, true, 0);
		spaces[8][9] = new Space(null, color, true, 0);
		// Set up row 9
		spaces[9][0] = new Space(null, color, true, 0);
		spaces[9][1] = new Space(null, color, true, 0);
		spaces[9][2] = new Space(null, color, true, 0);
		spaces[9][3] = new Space(null, color, true, 0);
		spaces[9][4] = new Space(null, color, true, 0);
		spaces[9][5] = new Space(null, color, true, 0);
		spaces[9][6] = new Space(rock, color, false, 0);
		spaces[9][7] = new Space(skulls, color, false, 0);
		spaces[9][8] = new Space(null, color, true, 0);
		spaces[9][9] = new Space(null, color, true, 0);
	
	//Special Instructions
	
	//Rock appears when portal is stepped on
	spaces[7][8].addInstruction(0, spaces[4][5], rock , color, false, 0); //makes rock45 appear
	spaces[7][8].addInstruction(0, spaces[7][8], portal , color, true, 1);//changes portal to state 1
	spaces[7][8].addInstruction(1, spaces[4][5], null , color, true, 0);//rock45 dissapears
	spaces[7][8].addInstruction(1, spaces[7][8], portal , color, true, 0);//portal state back to 0
	
	spaces[7][8].addInstruction(0, spaces[6][7], null , color, true, 0);//rock67 disapear
	spaces[7][8].addInstruction(1, spaces[6][7], rock , color, false, 0);//rock67 reapears
	}
	
}
