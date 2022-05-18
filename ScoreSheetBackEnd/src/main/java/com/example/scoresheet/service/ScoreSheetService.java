package com.example.scoresheet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoresheet.model.Player;
import com.example.scoresheet.model.ScoreSheet;
import com.example.scoresheet.repository.ScoreSheetRepository;


import java.util.List;


@Service
public class ScoreSheetService extends ScoreSheet {

        @Autowired
        ScoreSheetRepository ScoreSheetRepository;

        	//CREATE PLAYER
			public Player createPlayer(Player player) {
				return ScoreSheetRepository.save(player);
			}

			//READ
			public List<ScoreSheet> getScoreSheet() {
				return ScoreSheetRepository.findAll();

			}

			//DELETE
			public void deleteScoreSheet(Long playerNumber) {
				ScoreSheetRepository.deleteById(playerNumber);
			}

			//UPDATE SCORESHEET
			public ScoreSheet updatePlayer(Long playerNumber, Player newInfo) {
				Player scoresheet = (Player) ScoreSheetRepository.findById(playerNumber).get();
				
				scoresheet.setPlayerName(newInfo.getPlayerName());
				scoresheet.setPlayerNumber(newInfo.getPlayerNumber());
				scoresheet.setPoints(newInfo.getPoints());
				scoresheet.setRebounds(newInfo.getRebounds());
				scoresheet.setSteals(newInfo.getSteals());
				scoresheet.setTurnovers(newInfo.getTurnovers());
				scoresheet.setFouls(newInfo.getFouls());
				
				return ScoreSheetRepository.save(scoresheet);
			}
			
			//PATCH SCORESHEET PLAYER NAME
			public ScoreSheet updatePlayerName(Long playerNumber, String newPlayerName) {
				ScoreSheet scoresheet = ScoreSheetRepository.getById(playerNumber);
				
				scoresheet.setPlayerName(newPlayerName);
				
				return ScoreSheetRepository.save(scoresheet);
			}

			public ScoreSheet updatePlayerNumber(String playerName, Long playerNumber) {
				
				return null;
			}
			
		
}