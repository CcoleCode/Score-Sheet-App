package com.example.scoresheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scoresheet.model.Player;
import com.example.scoresheet.model.ScoreSheet;
import com.example.scoresheet.service.ScoreSheetService;


@RestController
@RequestMapping(path="/scoresheet")
public class ScoreSheetController {
	 @Autowired
     ScoreSheetService scoreSheetService;

	 //CREATE PLAYER ENTRY
     @PostMapping("/add-player")
     public Player createPlayer(@RequestBody Player player) {
    	 return scoreSheetService.createPlayer(player);
     }
     
     
     //READ SCORESHEET
     @GetMapping("/read-all")
     public List<ScoreSheet> readStats() {
         return scoreSheetService.getScoreSheet();
     }
     
     //UPDATE PLAYER
     @PutMapping("/update/{playerNumber}")
     public ScoreSheet updatePlayerStats(@PathVariable(value="playerNumber") Long playerNumber, @RequestBody Player playersInfo) {
    	 return scoreSheetService.updatePlayer(playerNumber, playersInfo);
     }
     
     //DELETE PLAYER
     @DeleteMapping("/delete/{playerNumber}")
     public void deleteTrack(@PathVariable(value="playerNumber") Long playerNumber) {
     	scoreSheetService.deleteScoreSheet(playerNumber);
     }
     
     //PATCH PLAYER NAME
     @PatchMapping("/update-name/{playerName}/{playerNumber}")
     public ScoreSheet patchPlayerName(@PathVariable(value = "id") Long playerNumber, @PathVariable(value = "name") String playerName) {
     	return scoreSheetService.updatePlayerName(playerNumber, playerName);
     }

     //PATCH PLAYER NUMBER
     @PatchMapping("/update-number/{playerNumber}/{playerName}")
     public ScoreSheet patchPlayerNumber(@PathVariable(value = "id") String playerName, @PathVariable(value = "name") Long playerNumber) {
     	return scoreSheetService.updatePlayerNumber(playerName, playerNumber);
     }
}