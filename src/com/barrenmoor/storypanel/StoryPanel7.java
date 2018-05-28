package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Player;

public class StoryPanel7 implements AbstractStoryPanel {
	private Player player;

	public StoryPanel7(Player cPlayer) {
		this.player = cPlayer;
	}

	public void entry() {
		if(player.getFlint()==true) {
			System.out.println("The golum is happy with your flint, he lets you pass.");
			player.setFlint(false);
		}
		else
			System.out.println("The golum is munching on the flint, he is having difficulty chewing.");
	}
	
	public int north() {
		System.out.println("The guardian is sitting in the way.");
		return 7;
	}
	public int south() {
		System.out.println("There is a steep hill, you cannot to go this way.");
		return 7;
	}
	public int east() {
		System.out.println("I have a feeling this is the correct way.");
		return 8;
	}
	public int west() {
		System.out.println("A landslide occurs, good night sweet prince.");
		return 25;
	}
	
	
	
	
}
