import java.awt.Color;

public class Zone2 extends Zone {
	// Attributes
Color color = new Color(122,102,100);
	// Constructors
	public Zone2(int dimensions, int pY, int pX, int eY, int eX) {
		super(dimensions);

		// player start
		playerStartX = pX;
		playerStartY = pY;

		// Enemy Start
		enemyStartX = eX;
		enemyStartY = eY;
		
		//Background Music
		backgroundMusic = zone1Music;
		//                      object  color  passable? state
		// Set up row 0
		spaces[0][0] = new Space(null, color, true, 0);
		spaces[0][1] = new Space(null, color, true, 0);
		spaces[0][2] = new Space(null, color, true, 0);
		spaces[0][3] = new Space(pillar, color, false, 0);
		spaces[0][4] = new Space(null, color, true, 0);
		spaces[0][5] = new Space(null, color, true, 0);
		spaces[0][6] = new Space(pillar, color, false, 0);
		spaces[0][7] = new Space(rockmonster, color, false, 0);
		spaces[0][8] = new Space(null, color, true, 0);
		spaces[0][9] = new Space(key, color, true, 0);

		// Set up row 1
		spaces[1][0] = new Space(null, color, true, 0);
		spaces[1][1] = new Space(null, color, true, 0);
		spaces[1][2] = new Space(rock, color, false, 0);
		spaces[1][3] = new Space(pillar, color, false, 0);
		spaces[1][4] = new Space(hole, color, true, 0);
		spaces[1][5] = new Space(null, color, true, 0);
		spaces[1][6] = new Space(pillar, color, false, 0);
		spaces[1][7] = new Space(null, color, true, 0);
		spaces[1][8] = new Space(null, color, true, 0);
		spaces[1][9] = new Space(null, color, true, 0);
		// Set up row 2
		spaces[2][0] = new Space(skulls, color, false, 0);
		spaces[2][1] = new Space(skulls, color, false, 0);
		spaces[2][2] = new Space(null, color, true, 0);
		spaces[2][3] = new Space(pillar, color, false, 0);
		spaces[2][4] = new Space(null, color, true, 0);
		spaces[2][5] = new Space(null, color, true, 0);
		spaces[2][6] = new Space(pillar, color, false, 0);
		spaces[2][7] = new Space(portal, color, true, 0);
		spaces[2][8] = new Space(null, color, true, 0);
		spaces[2][9] = new Space(null, color, true, 0);
		// Set up row 3
		spaces[3][0] = new Space(pillar, color, false, 0);
		spaces[3][1] = new Space(pillar, color, false, 0);
		spaces[3][2] = new Space(pillar, color, false, 0);
		spaces[3][3] = new Space(pillar, color, false, 0);
		spaces[3][4] = new Space(null, color, true, 0);
		spaces[3][5] = new Space(null, color, true, 0);
		spaces[3][6] = new Space(pillar, color, false, 0);
		spaces[3][7] = new Space(pillar, color, false, 0);
		spaces[3][8] = new Space(pillar, color, false, 0);
		spaces[3][9] = new Space(pillar, color, false, 0);
		// Set up row 4
		spaces[4][0] = new Space(null, color, true, 0);
		spaces[4][1] = new Space(rock, color, false, 0);
		spaces[4][2] = new Space(null, color, true, 0);
		spaces[4][3] = new Space(null, color, true, 0);
		spaces[4][4] = new Space(null, color, true, 0);
		spaces[4][5] = new Space(null, color, true, 0);
		spaces[4][6] = new Space(pillar, color, false, 0);
		spaces[4][7] = new Space(portal, color, true, 0);
		spaces[4][8] = new Space(null, color, true, 0);
		spaces[4][9] = new Space(lock, color, false, 0);
		// Set up row 5
		spaces[5][0] = new Space(rock, color, false, 0);
		spaces[5][1] = new Space(null, color, true, 0);
		spaces[5][2] = new Space(null, color, true, 0);
		spaces[5][3] = new Space(null, color, true, 0);
		spaces[5][4] = new Space(null, color, true, 0);
		spaces[5][5] = new Space(portal, color, true, 0);
		spaces[5][6] = new Space(pillar, color, false, 0);
		spaces[5][7] = new Space(null, color, true, 0);
		spaces[5][8] = new Space(null, color, true, 0);
		spaces[5][9] = new Space(null, color, true, 0);
		// Set up row 6
		spaces[6][0] = new Space(pillar, color, false, 0);
		spaces[6][1] = new Space(pillar, color, false, 0);
		spaces[6][2] = new Space(pillar, color, false, 0);
		spaces[6][3] = new Space(pillar, color, false, 0);
		spaces[6][4] = new Space(pillar, color, false, 0);
		spaces[6][5] = new Space(pillar, color, false, 0);
		spaces[6][6] = new Space(pillar, color, false, 0);
		spaces[6][7] = new Space(pillar, color, false, 0);
		spaces[6][8] = new Space(pillar, color, false, 0);
		spaces[6][9] = new Space(pillar, color, false, 0);
		// Set up row 7
		spaces[7][0] = new Space(null, color, true, 0);
		spaces[7][1] = new Space(skulls, color, false, 0);
		spaces[7][2] = new Space(null, color, true, 0);
		spaces[7][3] = new Space(pillar, color, false, 0);
		spaces[7][4] = new Space(button, color, true, 0);
		spaces[7][5] = new Space(null, color, true, 0);
		spaces[7][6] = new Space(pillar, color, false, 0);
		spaces[7][7] = new Space(null, color, true, 0);
		spaces[7][8] = new Space(portal, color, true, 0);
		spaces[7][9] = new Space(null, color, true, 0);
		// Set up row 8
		spaces[8][0] = new Space(null, color, true, 0);
		spaces[8][1] = new Space(null, color, true, 0);
		spaces[8][2] = new Space(skulls, color, false, 0);
		spaces[8][3] = new Space(pillar, color, false, 0);
		spaces[8][4] = new Space(null, color, true, 0);
		spaces[8][5] = new Space(null, color, true, 0);
		spaces[8][6] = new Space(pillar, color, false, 0);
		spaces[8][7] = new Space(portal, color, true, 0);
		spaces[8][8] = new Space(null, color, true, 0);
		spaces[8][9] = new Space(portal, color, true, 0);
		// Set up row 9
		spaces[9][0] = new Space(portal, color, true, 0);
		spaces[9][1] = new Space(null, color, true, 0);
		spaces[9][2] = new Space(null, color, true, 0);
		spaces[9][3] = new Space(pillar, color, false, 0);
		spaces[9][4] = new Space(portal, color, true, 0);
		spaces[9][5] = new Space(null, color, true, 0);
		spaces[9][6] = new Space(pillar, color, false, 0);
		spaces[9][7] = new Space(skulls, color, false, 0);
		spaces[9][8] = new Space(portal, color, true, 0);
		spaces[9][9] = new Space(null, color, true, 0);
	
	//Special Instructions
	
	//Rock appears when portal is stepped on
							//trigger, 	target,   		pic, 	color, passability, state, 	warp, 	newY, 	newX
		spaces[2][1].addInstruction(0, 		spaces[2][1], 	button , color, true,     	1,    	false, 	0,   	0,		null); //turns the skulls to button
		spaces[2][1].addInstruction(0, 		spaces[2][2], 	skulls , color, false,     	0,    	false, 	0,   	0,		null); //moves the skulls
		spaces[2][1].addInstruction(1, 		spaces[1][2], 	hole , color, 	true,     	1,    	false, 	0,   	0,		null);//button makes hole appear
		spaces[2][1].addInstruction(1, 		spaces[0][2], 	rock , color, false,     	0,    	false, 	0,   	0,		null); //and moves rock
		spaces[1][2].addInstruction(1, 		spaces[1][2], 	hole , color, true,     	1,    	true, 	1,   	4,		null); //hole moves player
		spaces[1][4].addInstruction(0, 		spaces[1][4], 	hole , color, true,     	0,    	true, 	1,   	2,		null); //hole moves player back
		spaces[5][5].addInstruction(0, 		spaces[5][5], 	portal , color, true,     	0,    	true, 	7,   	8,		null);//portal 1 teleports player to portal 2
		spaces[7][8].addInstruction(0, 		spaces[7][8], 	portal , color, true,     	0,    	true, 	5,   	5,		null);//portal 2 teleports back to 1
		spaces[9][8].addInstruction(0, 		spaces[9][8], 	portal , color, true,     	0,    	true, 	9,   	4,		null);//portal 3 teleports to portal 4
		spaces[9][4].addInstruction(0, 		spaces[9][4], 	portal , color, true,     	0,    	true, 	9,   	8,		null);//portal 2 teleports back to 1
		spaces[7][4].addInstruction(0, 		spaces[7][2], 	portal , color, true,     	1,    	false, 	0,   	0,		null);//button makes portal 5 appear
		spaces[8][9].addInstruction(0, 		spaces[8][9], 	portal , color, true,     	0,    	true, 	9,   	0,		null);//portal 6 goes to portal 7
		spaces[9][0].addInstruction(0, 		spaces[9][0], 	portal , color, true,     	0,    	true, 	8,   	9,		null);//portal 7 back to 6
		spaces[4][1].addInstruction(0, 		spaces[4][0], 	rock , color, false,     	0,    	false, 	0,   	0,		null);//moves rock and
		spaces[4][1].addInstruction(0, 		spaces[4][1], 	button , color, true,     	1,    	false, 	0,   	0,		null);//button appears
		spaces[4][1].addInstruction(1, 		spaces[7][0], 	skulls , color, false,     	1,    	false, 	0,   	0,		null);//moves rock and
		spaces[4][1].addInstruction(1, 		spaces[7][1], 	null , color, true,     	1,    	false, 	0,   	0,		null);//blank space
		spaces[8][9].addInstruction(0, 		spaces[8][9], 	portal , color, true,     	0,    	true, 	9,   	0,		null);//portal 8 teleports to portal 9
		spaces[9][0].addInstruction(0, 		spaces[9][0], 	portal , color, true,     	0,    	true, 	8,   	9,		null);//portal 9 teleports to portal 8
		spaces[7][2].addInstruction(1, 		spaces[7][2], 	portal , color, true,     	1,    	true, 	2,   	7,		null);//portal 10 teleports to portal 11
		spaces[2][7].addInstruction(0, 		spaces[2][7], 	portal , color, true,     	0,    	true, 	7,   	2,		null);//portal 11 teleports to portal 10
		spaces[8][7].addInstruction(0, 		spaces[8][7], 	portal , color, true,     	0,    	true, 	4,   	7,		null);//portal 12 teleports to portal 13
		spaces[4][7].addInstruction(0, 		spaces[4][7], 	portal , color, true,     	0,    	true, 	8,   	7,		null);//portal 13 teleports to portal 13
		spaces[0][9].addInstruction(0,      spaces[4][9],   lock,    color, false,      1,      false,  0,      0,		null); //changes lock to spate 1
		spaces[0][9].addInstruction(0,      spaces[0][9],   null,    color, true,       1,      false,  0,      0,		keyPickup); //key dissapears
		spaces[4][9].addInstruction(1,      spaces[4][9],   arrow,   color, true,       2,      false,  0,      0,		null); //changes lock to space 1
	}
	//Methods
	public void enableZoneWarpSpaces() {
	//Sets up warp spaces to new zones
	//
//	spaces[4][9].setNextZone(new Zone2(dimensions,	0,	0);
	}
}

	
	

