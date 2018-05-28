package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Player;

public class StoryPanel8 implements AbstractStoryPanel {
	private Player player;

	public StoryPanel8(Player cPlayer) {
		this.player = cPlayer;
	}

	public void entry() {
		System.out.println("Its a bit moor-ish around here.");
	}
	
	public int north() {
		if(player.getDev() == true) System.out.println("I guess onwards we go.");
		else 						System.out.println("I guess onwards I go.");
		return 13;
	}
	public int south() {
		System.out.println("You are the first person to discover dragons.\r" +
				"They kill you of course so you do not get to document your discovery.");
		return -1;
	}
	public int east() {
		System.out.println("Oh now here is a surprise...");
		return 9;
	}
	public int west() {
		System.out.println("The stone creature is flailing around due to choking, he kills you.");
		return -1;
	}
	
	
	
	
}
