package com.barrenmoor.storypanel;

import com.barrenmoor.characters.Dragon;
import com.barrenmoor.characters.Player;
import com.barrenmoor.storypanel.AbstractStoryPanel;

public class StoryPanel21 implements AbstractStoryPanel {
	private Player player;
	private Dragon dragon;

	public StoryPanel21(Player player, Dragon dragon) {
		this.player = player;
		this.dragon = dragon;
	}

	public void entry() {
		System.out.println("Which way do you go?");
	}
	
	public int north() {
		System.out.println("This is not the way.");
		return 21;
	}
	public int south() {
		return 16;
	}
	public int east() {
		if(dragon.getCurrentPanel() == 22) {
			System.out.println("You approach the dragon from his blind side.");
			if (player.hasGhillieOn())
				System.out.println("Though this doesn't matter because you has your Ghillie suit on.");
		} else
			System.out.println("You approach the spot where you found the dragon.");
		return 22;
	}
	public int west() {
		System.out.println("This is not the way.");
		return 21;
	}
	
	
	
	
}
