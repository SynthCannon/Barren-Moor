package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Player;

public class StoryPanel11 implements AbstractStoryPanel {
	private Player player;

	public StoryPanel11(Player cPlayer) {
		this.player = cPlayer;
	}

	public void entry() {
		System.out.println("You find your old pal Dev munching some Pringles, he has been missing for a few years now.\r" +
							"He appears... happily relocated.");
	}
	
	public int north() {
		System.out.println("You are the first person to discover dragons.\r" +
						"They kill you of course so you do not get to document your discovery.");
		return -1;
	}
	public int south() {
		System.out.println("You are a very dodgy person, you head south and die for some unknown reason.");
		return -1;
	}
	public int east() {
		System.out.println("Dev joins your team, and you both sing the song of your people.");
		player.setDev(true);
		return 12;
	}
	public int west() {
		System.out.println("You will never get the high score with that attitude.");
		return 10;
	}
	
	
	
	
}
