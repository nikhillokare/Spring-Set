package com.bean;

public class Player {
	
	private int jno;
	private String PlayerName;
	
	//Getters and Setters
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	@Override
	public String toString() {
		return "Player jno=" + jno + ", PlayerName=" + PlayerName;
	}
	
	

}
