package com.mz.cth.nameisland.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mz.cth.nameisland.model.Game;
import com.mz.cth.nameisland.services.GameService;

@RestController
@RequestMapping("/api")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@CrossOrigin
	@PostMapping("/setGame")
	public @ResponseBody ResponseEntity<?> save(@RequestBody Game game) {
		
		System.err.println(game.getRound()+""+game.getChallengedId() + "" + game.getTime()+ " "+ game.getLevel()+game.getChallengerId());
		
		return new ResponseEntity<>(gameService.save(game), HttpStatus.OK);

	}
	@CrossOrigin
	@GetMapping("/getGame/{id}")
	public @ResponseBody ResponseEntity<?> getMyGame(@PathVariable ("id") long id) {
		
		
		return new ResponseEntity<>(gameService.findByPlayer(id), HttpStatus.OK);

	}
}
