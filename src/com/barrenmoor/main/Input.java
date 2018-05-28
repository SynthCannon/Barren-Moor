package com.barrenmoor.main;

import java.util.Scanner;

import com.barrenmoor.characters.Dragon;
import com.barrenmoor.characters.Player;
import com.barrenmoor.storygrid.StoryGrid;

public class Input {
	private Scanner keyboard;
	private Player player;
	private Dragon dragon;
	private StoryGrid grid;

	protected Input(Scanner keyboard, StoryGrid grid, Player player, Dragon dragon) {
		this.keyboard = keyboard;
		this.grid = grid;
		this.player = player;
		this.dragon = dragon;
	}
	
	protected boolean storyInput() {
		System.out.println("The compass says " + player.compassOutput());

		if (dragon.isChasing())
			System.out.println("The dragon is chasing you!!!");
		if (dragon.getCurrentPanel() != 22)
			System.out.println("The dragon has left it's spot");

		System.out.print("Which direction do you wish to proceed? (n/e/s/w)");
		if (player.hasGhillie())
			System.out.print(" or Ghillie toggle with g");
		
		System.out.println();
		String input = new String();
		input = keyboard.nextLine();

		input.toLowerCase();

		if (input.equals("n") || input.equals("e") || input.equals("s") || input.equals("w"))
			handleDirectionInput(input.toCharArray()[0]);
		else if (input.equals("g") && player.hasGhillie()) {
			player.setGhillieOn(!player.hasGhillieOn());
			if(player.hasGhillieOn())
				System.out.println("You put on your Ghillie suit");
			else
				System.out.println("You take off your Ghillie suit");

			if (dragon.isChasing() && player.hasGhillieOn()) {
				System.out.println("The dragon loses sight of you");
				dragon.setChasing(false);
			} else if (dragon.getCurrentPanel() == player.getCurrentPanel() && !player.hasGhillieOn()) {
				System.out.println("You reveal yourself to the dragon and it starts chasing you");
				dragon.setChasing(true);
			}
				
		} else {
			System.out.println("Please enter a valid input");
			return false;
		}

		return true;
	}
	
	private void handleDirectionInput(char direction) {
		int lastLocation = player.getCurrentPanel();
		
		player.setCurrentPanel(grid.moveCurrentPanel(direction, player.getCurrentPanel()));
		
		if (lastLocation == dragon.getCurrentPanel() && !player.hasGhillieOn() && player.getCurrentPanel() != -1) {
			if (!dragon.isChasing()) {
				System.out.println("The dragon starts chasing you");
				dragon.setChasing(true);
			}
			dragon.setCurrentPanel(player.getCurrentPanel());
		}
		if (dragon.getCurrentPanel() != player.getCurrentPanel() && player.getCurrentPanel() == 22)
			player.setCurrentPanel(100);
	}
	
	protected boolean userReplays() {
		String input = new String();

		while (true) {
			System.out.println("Do you wish to play again? (y/n)");
			input = keyboard.nextLine();

			if (input.equals("n")) {
				System.out.println("Thanks for playing.");
				return true;
			}
			else if (input.equals("y")) {
				System.out.println("Lets play again then, and find out more sacred lore.");
				return false;
			}
			else
				System.out.println("Please enter a valid input");
		}
	}

}
