package com.barrenmoor.main;

import java.util.Scanner;

import com.barrenmoor.characters.Dragon;
import com.barrenmoor.characters.Player;
import com.barrenmoor.storygrid.StoryGrid;

public class Game {
	private static Scanner keyboard = new Scanner(System.in);
	private Player player = new Player();
	private Dragon dragon = new Dragon();
	private StoryGrid grid = new StoryGrid(player, dragon);
	
	private Input input = new Input(keyboard,grid,player,dragon);

	protected Game() {

		do {
			player.restoreDefaults();
			dragon.restoreDefaults();

			System.out.println("This compass your mysterious new friend has given you...\r" + "What is its purpose?\r"
					+ "The number displayed has been falling as you approached the infinite barren moor.\r"
					+ "As you face the moor, you look at the sun and know you are looking north.\r"
					+ "Proceed if you dare...");

			do {continueStory();} 
			while (checkWinLose());

		} while (!input.userReplays());

		keyboard.close();
	}

	private void continueStory() {
		grid.getPanel(player.getCurrentPanel()).entry();

		while (!input.storyInput());
	}
	
	private boolean checkWinLose() {
		switch (player.getCurrentPanel()) {
		case -1:
			System.out.println(
					"You are not successful this time, but time is just an artificial construct, so please play again.");
			return false;
		case 100:
			System.out.println("You have lost the dragon and approach the area the compass guides you to.\r"
					+ "The compass reaches zero as you find... a powerful magnet.\r"
					+ "Your 'compass' was a magnetometer stuck in reverse, how foolish of you.\r"
					+ "Well... Congratulations, you have won to some extent, give yourself a pat on the back.\r"
					+ "You are successful this time, but time is just an articial construct, so please play again.");
			return false;
		default:
			return true;
		}
	}

}
