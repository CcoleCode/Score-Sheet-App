package com.example.scoresheet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class ScoreSheet {
        
        @Id
       // @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long playerNumber;
        private String playerName;
       
        
        public ScoreSheet() {}
        
        public ScoreSheet(String playerName, Long playerNumber, String points, String rebounds, String steals, String turnovers, String fouls) {
			this.playerName = playerName;
			this.playerNumber = playerNumber;
        }

		public Long getPlayerNumber() {
			return playerNumber;
		}

		public void setPlayerNumber(Long playerNumber) {
			this.playerNumber = playerNumber;
		}

		public String getPlayerName() {
			return playerName;
		}

		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}


		
		
}

