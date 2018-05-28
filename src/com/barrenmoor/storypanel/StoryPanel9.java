package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Player;

public class StoryPanel9 implements AbstractStoryPanel {
	private Player player;

	public StoryPanel9(Player cPlayer) {
		this.player = cPlayer;
	}

	public void entry() {
		System.out.println("The Shafeeq himself has appeared, he asks you if you have seen the news to which you say no.");
		System.out.println("The Shafeeq: THE NEWS SAYS I HATE YOU!");
		if(player.getDev()) {
			System.out.println("Dev gets scared and runs away.");
			player.setDev(false);
		}
		System.out.println("If you stay here, you will die from over-Java-ing, Dev had the right idea.");
	}
	
	public int north() {
		System.out.println("The Shafeeq: THIS IS NOT AN OBJECT\rThe Shafeeq stops you going this way.");
		return 9;
	}
	public int south() {
		System.out.println("The Shafeeq: THIS IS NOT A DATA MEMBER\rThe Shafeeq stops you going this way.");
		return 9;
	}
	public int west() {
		System.out.println("That was kinda pointless... At least you don't have to put up with Dev now.");
		return 8;
	}
	public int east() {
		System.out.println("The Shafeeq's KGB kills you, seems he was working with them all this time.");
		return -1;
	}
	
	
	
	
}
