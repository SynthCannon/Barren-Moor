package com.barrenmoor.characters;

public class Dragon extends Character{
	
	boolean chasing;
	
	public Dragon() {
		// TODO Auto-generated constructor stub
	}

	public boolean isChasing() {
		return chasing;
	}

	public void setChasing(boolean chasing) {
		this.chasing = chasing;
	}

	@Override
	public void restoreDefaults() {
		this.currentPanel = 22;
		this.chasing = false;
	}

}
