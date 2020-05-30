package com.mz.cth.nameisland.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mz.cth.nameisland.beans.LoginBean;
import com.mz.cth.nameisland.beans.SignUpBean;
import com.mz.cth.nameisland.model.Player;
import com.mz.cth.nameisland.services.PlayerService;

@RestController
@RequestMapping("/api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@CrossOrigin
	@PostMapping("/signup")
	public @ResponseBody ResponseEntity<?> save(@RequestBody SignUpBean signUp) {
		Player player = new Player(signUp.getUsername(), signUp.getEmail(), signUp.getPwd());

		return new ResponseEntity<>(playerService.save(player), HttpStatus.OK);

	}

	@CrossOrigin
	@PostMapping("/signin")
	public @ResponseBody ResponseEntity<?> login(@RequestBody LoginBean loginBean) {

		return new ResponseEntity<>(playerService.login(loginBean.getUsername(), loginBean.getPwd()), HttpStatus.OK);

	}
}
