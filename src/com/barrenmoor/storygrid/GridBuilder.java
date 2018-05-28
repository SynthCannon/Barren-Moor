package com.barrenmoor.storygrid;

import java.util.HashMap;

import com.barrenmoor.characters.Dragon;
import com.barrenmoor.characters.Player;
import com.barrenmoor.storypanel.*;


public class GridBuilder {
	

	public static void buildGrid(HashMap<Integer,AbstractStoryPanel> grid, Player player, Dragon dragon) {
	
		for(int i = 0; i < 25; i++) {
			grid.put((Integer) i,new StoryPanel() );
		}
		
		paintPlainPanels(grid);
		functionalPanels(grid, player, dragon);

	}
	
	
	private static void functionalPanels(HashMap<Integer,AbstractStoryPanel> grid, Player player, Dragon dragon) { // 1,7,8,9,11,17,22,24
		grid.put((Integer) 1, new StoryPanel1(player));
		grid.put((Integer) 7, new StoryPanel7(player));
		grid.put((Integer) 8, new StoryPanel8(player));
		grid.put((Integer) 9, new StoryPanel9(player));
		grid.put((Integer) 11, new StoryPanel11(player));
		grid.put((Integer) 17, new StoryPanel17(player,dragon));
		grid.put((Integer) 21, new StoryPanel21(player,dragon));
		grid.put((Integer) 22, new StoryPanel22(player,dragon));
		grid.put((Integer) 24, new StoryPanel24(player));
	}
	
	
	private static void paintPlainPanels(HashMap<Integer,AbstractStoryPanel> grid) {
		((StoryPanel) grid.get(0)).paintStoryStrings(
				"Nice looking area, good views, you can see some smoke in the distance though.",
				"This is good! Progress! Onwards!",
				"Wolves have followed you hahaha your dead... Try again, this is going to be fun for me.",
				"You run home like the coward you are.",
				"You sink into the bog and find yourself unable to get out."
				);
		((StoryPanel) grid.get(0)).paintMoveToPanelVals(5, -1, -1, -1);

		
		((StoryPanel) grid.get(2)).paintStoryStrings(
				"",
				"You are encountered by a stone guardian.\r" + 
					"He wants some food, he only eats flint.\r" + 
					"He won't let you pass unless you give him some flint.",
				"You are the first person to discover dragons.\r" + 
						"They kill you of course so you do not get to document your discovery.",
				"You run home like the coward you are.",
				"This moor is awfully smelly."
				);
		((StoryPanel) grid.get(2)).paintMoveToPanelVals(2,-1,-1,1);

		
		((StoryPanel) grid.get(5)).paintStoryStrings(
				"You begin heading downwards.",
				"Further progress, excellent.",
				"Steep hill, whoopsidoodles.",
				"Some wolves have caught up and so you must go a different direction.",
				"You sink into the bog and find yourself unable to get out."
				);
		((StoryPanel) grid.get(5)).paintMoveToPanelVals(10,-1,5,-1);


		((StoryPanel) grid.get(8)).paintStoryStrings(
				"Its a bit moor-ish around here.",
				"I guess onwards.",
				"Oh now here is a surprise...",
				"You are the first person to discover dragons.\r" +
					"They kill you of course so you do not get to document your discovery.",
				"The stone creature is flailing around due to choking, he kills you."
				);
		((StoryPanel) grid.get(8)).paintMoveToPanelVals(13,9,-1,-1);


		((StoryPanel) grid.get(10)).paintStoryStrings(
				"You find some swamp cows doing as swamp cows do, climbing trees and whatnot.",
				"As you approach the swamp cows, they charge towards you, you go back the way you came.",
				"You are now at the bottom of the hill.",
				"Having second thoughts are we?",
				"You sink into the bog and find yourself unable to get out."
				);
		((StoryPanel) grid.get(10)).paintMoveToPanelVals(5,11,5,-1);
		

		((StoryPanel) grid.get(12)).paintStoryStrings(
				"Dev continues to eat Pringles without offering them to you.",
				"A dragon swoops overhead and kills you with its meer presence, ouch!",
				"Gareth appears and starts trying to convert you to the church-of-mark.\r" + 
					"You stay back from him because the church of Dwayne 'The Rock' Johnson is all you have known.",
				"You approach the golum.",
				"Dev sits back on his tuffet."
				);
		((StoryPanel) grid.get(12)).paintMoveToPanelVals(-1,12,7,11);

		
		((StoryPanel) grid.get(13)).paintStoryStrings(
				"Just go north... Please just go north.",
				"Good, an obedient player.",
				"This isn't north...",
				"This isn't north...",
				"This isn't north..."
				);
		((StoryPanel) grid.get(13)).paintMoveToPanelVals(18,13,13,13);


		((StoryPanel) grid.get(16)).paintStoryStrings(
				"Is this the correct way?",
				"Maybe...",
				"This could be the correct way.",
				"You die from dragon breath, this is a problem.",
				"Kirsty appears and recruits you at QA Consulting.\r"
				+ "13 years have passed and death awaited you due to NHS privatisation."
				);
		((StoryPanel) grid.get(16)).paintMoveToPanelVals(21,17,-1,-1);

		
		((StoryPanel) grid.get(18)).paintStoryStrings(
				"Getting very close now.",
				"Death by Java!!!!",
				"Yes, this way my child.",
				"Ha!!!! Not happening.",
				"Good luck!"
				);
		((StoryPanel) grid.get(18)).paintMoveToPanelVals(-1,19,18,17);


		((StoryPanel) grid.get(19)).paintStoryStrings(
				"I hear barracks.",
				"Barracks getting louder.",
				"You get lost forever, bye.",
				"The Shafeeq appears from nowhere... kills you with good looks and chicken cottage, a lethal combination.",
				"Slow and steady wins the race."
				);
		((StoryPanel) grid.get(19)).paintMoveToPanelVals(24,-1,-1,18);		
	}
}