package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Player;

public class StoryPanel1 implements AbstractStoryPanel {
	private Player player;

	public StoryPanel1(Player cPlayer) {
		this.player = cPlayer;
	}

	public void entry() {
		System.out.println("You head up a squelchy hill and find some flint.");
		player.setFlint(true);
	}
	
	public int north() {
		System.out.println("You head north over a bridge, which then collapses.\r" +
							"You are dead.");
		return -1;
	}
	public int south() {
		System.out.println("You run home like the coward you are.");
		return -1;
	}
	public int east() {
		System.out.println("You slip down the hill and get killed, you should have been more careful.");
		return -1;
	}
	public int west() {
		System.out.println("You head further along the hill.");
		return 0;
	}
	
	
	
	
}
