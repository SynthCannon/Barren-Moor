package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Player;

public class StoryPanel24 implements AbstractStoryPanel {
	private Player player;

	public StoryPanel24(Player cPlayer) {
		this.player = cPlayer;
	}

	public void entry() {
		System.out.println("You find John training his trainees military style.\r" +
							"John: COME NOW TRAINEE, WE GOT LOTS OF WORK TO DO!");
		if(player.hasGhillie() == false) {
							System.out.println("He gives you a Ghillie suit, briefs you and you begin training.");
							player.setGhillie(true);
		}
	}
	
	public int north() {
		System.out.println("John doesn't let you leave.");
		return 24;
	}
	public int south() {
		System.out.println("You pull a fast one on John.");
		return 19;
	}
	public int east() {
		System.out.println("John doesn't let you leave.");
		return 24;
	}
	public int west() {
		System.out.println("John seriously doesn't let you leave this way, he shoots you with his musket.");
		return -1;
	}
	
	
	
	
}
