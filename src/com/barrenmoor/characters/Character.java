package com.barrenmoor.characters;

public abstract class Character {
	protected int currentPanel;
	
	public abstract void restoreDefaults();
	
	public int getCurrentPanel() {
		return currentPanel;
	}

	public void setCurrentPanel(int currentPanel) {
		this.currentPanel = currentPanel;
	}

}
