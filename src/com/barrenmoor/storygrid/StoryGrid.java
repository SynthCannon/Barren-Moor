package com.barrenmoor.storygrid;
import java.util.HashMap;

import com.barrenmoor.characters.Dragon;
import com.barrenmoor.characters.Player;
import com.barrenmoor.storypanel.AbstractStoryPanel;


public class StoryGrid {
	HashMap<Integer,AbstractStoryPanel> grid = new HashMap<Integer,AbstractStoryPanel>();
	
	public StoryGrid(Player player, Dragon dragon) {
		GridBuilder.buildGrid(grid, player, dragon);
	}
	
	public AbstractStoryPanel getPanel(int panelNum) {
		return grid.get(panelNum);
	}

	public int moveCurrentPanel(char dir, int panelNum) {
		switch(dir) {
			case 'n':
				return getPanel(panelNum).north();
			case 'e':
				return getPanel(panelNum).east();
			case 's':
				return getPanel(panelNum).south();
			case 'w':
				return getPanel(panelNum).west();
			default:
				System.out.println("Broken game!!!");
				return -1;
		}
		
	}
}