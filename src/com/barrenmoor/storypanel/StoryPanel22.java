package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Dragon;
import com.barrenmoor.characters.Player;

public class StoryPanel22 implements AbstractStoryPanel {
	private Player player;
	private Dragon dragon;

	public StoryPanel22(Player player, Dragon dragon) {
		this.player = player;
		this.dragon = dragon;
	}

	public void entry() {
		if (!player.hasGhilliOn())
			System.out.println("The dragon takes a while to notice you, he takes a while to start chasing you, what do you do?");	
		else 
			System.out.println("The dragon does not notice you.");
	}
	
	public int north() {
		System.out.println("There is injured dragon this way.");
		return 22;
	}
	public int south() {
		if (!player.hasGhilliOn() && dragon.getCurrentPanel() == 22) {
			System.out.println("You head south and the dragon follows you.");
			dragon.setChasing(true);
		} else
			System.out.println("You leave the dragon behind you.");
		return 17;
	}
	public int east() {
		System.out.println("There is injured dragon this way.");
		return 22;
	}
	public int west() {
		if (player.hasGhilliOn()) {
			System.out.println("You avoid detection by the dragon");
			return 21;
		}
			
		System.out.println("You die by tail whip...");
		return -1;
	}
	
	
	
	
}
