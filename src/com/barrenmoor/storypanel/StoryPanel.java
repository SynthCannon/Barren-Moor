package com.barrenmoor.storypanel;

public class StoryPanel implements AbstractStoryPanel{

	private String[] storyString = new String[5];
	private int[] moveToPanel = new int[4];
	
	public void paintStoryStrings(String entryString, String northString, String eastString, String southString, String westString) {
		this.storyString[0] = northString;
		this.storyString[1] = eastString;
		this.storyString[2] = southString;
		this.storyString[3] = westString;
		this.storyString[4] = entryString;
	}
	
	public void paintMoveToPanelVals (int moveNorth, int moveEast, int moveSouth, int moveWest) {
		this.moveToPanel[0] = moveNorth;
		this.moveToPanel[1] = moveEast;
		this.moveToPanel[2] = moveSouth;
		this.moveToPanel[3] = moveWest;
	}
	
	@Override
	public void entry() {
		System.out.println(storyString[4]);
	}

	@Override
	public int north() {
		System.out.println(storyString[0]);
		return moveToPanel[0];
	}

	@Override
	public int east() {
		System.out.println(storyString[1]);
		return moveToPanel[1];
	}
	
	@Override
	public int south() {
		System.out.println(storyString[2]);
		return moveToPanel[2];
	}

	@Override
	public int west() {
		System.out.println(storyString[3]);
		return moveToPanel[3];
	}

}
