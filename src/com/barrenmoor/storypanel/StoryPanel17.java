package com.barrenmoor.storypanel;
import com.barrenmoor.characters.Dragon;
import com.barrenmoor.characters.Player;

public class StoryPanel17 implements AbstractStoryPanel {
	private Player player;
	private Dragon dragon;

	public StoryPanel17(Player player, Dragon dragon) {
		this.player = player;
		this.dragon = dragon;
	}

	public void entry() {
		if (dragon.getCurrentPanel() == 22) {
			System.out.println("You hear a growling sound from a close area, a very dangerous sounding creature indeed.");
		} else {
			System.out.println("Be careful of the dragon.");
		}
	}
	
	public int north() {
		if (dragon.getCurrentPanel() == 22) {
			if (player.hasGhillieOn()) {
				System.out.println("You safely approach an injured dragon with your Ghillie suit on.");
				return 22;	
			} else {
				System.out.println("Injured dragon encounter, well done on the discovery, too bad it ate you.");
				return -1;
			}
		} else {
			if(dragon.isChasing() == false) {
				return 22;
			} else {
				System.out.println("The dragon corners you and you're now dead.");
				return -1;
			}
		}

	}
	
	public int south() {
		System.out.println("This narrator is just not letting you go this way");
		return 17;
	}
	public int east() {
		System.out.println("Is this the right way?");
		return 18;
	}
	public int west() {
		System.out.println("Is this the right way?");
		return 16;
	}
	
	
	
	
}
