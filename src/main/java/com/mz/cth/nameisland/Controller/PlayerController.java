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

import com.mz.cth.nameisland.beans.LoginBean;
import com.mz.cth.nameisland.beans.SignupBean;
import com.mz.cth.nameisland.model.Player;
import com.mz.cth.nameisland.services.PlayerService;

@RestController
@RequestMapping("/api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@CrossOrigin
	@PostMapping("/signup")
	public @ResponseBody ResponseEntity<?> save(@RequestBody SignupBean signUp) {
		Player player = new Player(signUp.getUsername(), signUp.getEmail(), signUp.getPwd());

		return new ResponseEntity<>(playerService.save(player), HttpStatus.OK);

	}

	@CrossOrigin
	@PostMapping("/signin")
	public @ResponseBody ResponseEntity<?> login(@RequestBody LoginBean loginBean) {

		return new ResponseEntity<>(playerService.login(loginBean.getUsername(), loginBean.getPwd()), HttpStatus.OK);

	}
	@CrossOrigin
	@GetMapping("/players")
	public @ResponseBody ResponseEntity<?> getAllOnline() {

		return new ResponseEntity<>(playerService.findPlayersOnline(), HttpStatus.OK);

	}
	@CrossOrigin
	@GetMapping("/setStatus/{id}")
	public @ResponseBody ResponseEntity<?> setPlayerStatus(@PathVariable ("id") long id) {
     
	
		return new ResponseEntity<>(playerService.changeStatus(id), HttpStatus.OK);

	}
	@CrossOrigin
	@GetMapping("/player/{id}")
	public @ResponseBody ResponseEntity<?> getPlayer(@PathVariable ("id") long id) {
     
	
		return new ResponseEntity<>(playerService.findById(id), HttpStatus.OK);

	}
}
