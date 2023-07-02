package com.bean;

import java.util.Set;

public class CricketTeam {
	
	private String countryName,coachName;
	private Set<Player> players;
	
	//Getters and Setters
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	//display Method
	public void display(){
		System.out.println("********Cricket Details********");
		System.out.println("Country Name::"+getCountryName());
		System.out.println("Coach Name::"+getCoachName());
		 Set<Player> s=getPlayers();
		 for(Player s1:s)
		 {
			 System.out.println(s1);
		 }
		
		
	}
	
	

}
