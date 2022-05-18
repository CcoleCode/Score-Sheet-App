package com.example.scoresheet.model;

import javax.persistence.Entity;

@Entity
public class Player extends ScoreSheet {
        
	 private String points;
     private String rebounds;
     private String steals;
     private String turnovers;
     private String fouls;
        
       

	public Player(String playerName, Long playerNumber, String points, String rebounds, String steals, String turnovers,
			String fouls) {
		super(playerName, playerNumber, points, rebounds, steals, turnovers, fouls);
		
	}

		public Player() {}

		

		public String getPoints() {
			return points;
		}

		public void setPoints(String points) {
			this.points = points;
		}

		public String getRebounds() {
			return rebounds;
		}

		public void setRebounds(String rebounds) {
			this.rebounds = rebounds;
		}

		public String getSteals() {
			return steals;
		}

		public void setSteals(String steals) {
			this.steals = steals;
		}

		public String getTurnovers() {
			return turnovers;
		}

		public void setTurnovers(String turnovers) {
			this.turnovers = turnovers;
		}

		public String getFouls() {
			return fouls;
		}

		public void setFouls(String fouls) {
			this.fouls = fouls;
		}

		@Override
		public String toString() {
			return "Player [points=" + points + ", rebounds=" + rebounds + ", steals=" + steals + ", turnovers="
					+ turnovers + ", fouls=" + fouls + ", getPoints()=" + getPoints() + ", getRebounds()="
					+ getRebounds() + ", getSteals()=" + getSteals() + ", getTurnovers()=" + getTurnovers()
					+ ", getFouls()=" + getFouls() + ", getPlayerNumber()=" + getPlayerNumber() + ", getPlayerName()="
					+ getPlayerName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

		
        
}
