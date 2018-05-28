package com.barrenmoor.characters;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Player extends Character{
	/*
	 * Simple inventory and equipment system
	 * Player does not have option to hold more than one of each item
	 * item 1: flint
	 * item 2: Dev
	 * item 3: Ghillie suit
	 * item 4: Ghillie suit on/off
	 * get and set methods for each item/equipment
	 * 
	 */
	private boolean[] inventory = {false,false,false,false};
	
	@Override
	public void restoreDefaults() {
		this.currentPanel = 19;
		int x = 0;
		while(x < inventory.length) {
			inventory[x] = false;
			x++;
		}
	}
	
	public void setFlint (boolean arg) {
		inventory[0]= arg;
	}
	public boolean getFlint () {
		return inventory[0];
	}
	
	public void setDev (boolean arg) {
		inventory[1]= arg;
	}
	public boolean getDev () {
		return inventory[1];
	}
	public void setGhillie (boolean arg) {
		inventory[2]= arg;
	}
	public boolean hasGhillie () {
		return inventory[2];
	}
	public void setGhillieOn (boolean arg) {
		inventory[3]= arg;
	}
	public boolean hasGhillieOn () {
		return inventory[3];
	}
	
	public String compassOutput() {
		NumberFormat distFormat = new DecimalFormat("#0.0");
		double gridDist = 0;
		int gridx, gridy, gridTemp;
		
		gridx = currentPanel%5;
		gridy = (currentPanel - gridx)/5;
		gridTemp = (2-gridx)*(2-gridx) + (4-gridy)*(4-gridy);
		gridDist = Math.sqrt(gridTemp);
		
		return distFormat.format(gridDist);
	}

}
