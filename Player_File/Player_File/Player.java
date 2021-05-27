package com.interview.players;

public class Player {

	
	String name;
	String country;
	int totalRuns;
	int highestScore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	public Player(String name, String country, int totalRuns, int highestScore) {
		super();
		this.name = name;
		this.country = country;
		this.totalRuns = totalRuns;
		this.highestScore = highestScore;
	}
	public Player() {
		super();
		
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", totalRuns=" + totalRuns + ", highestScore="
				+ highestScore + "]";
	}
	
}
