package com.interview.players;

import java.util.List;

public class CricketStatistics {

	List<Player> playersList;

	public List<Player> getplayersList() {
		return playersList;
	}

	public void setplayersList(List<Player> playersList) {
		this.playersList = playersList;
	}

	public CricketStatistics(List<Player> playersList) {
		super();
		this.playersList = playersList;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [playersList=" + playersList + "]";
	}
	
	
}
