package com.mz.cth.nameisland.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mz.cth.nameisland.beans.AnswerBean;
import com.mz.cth.nameisland.model.Answer;
import com.mz.cth.nameisland.model.Game;
import com.mz.cth.nameisland.model.Player;
import com.mz.cth.nameisland.model.Question;
import com.mz.cth.nameisland.services.AnswerService;
import com.mz.cth.nameisland.services.GameService;
import com.mz.cth.nameisland.services.PlayerService;
import com.mz.cth.nameisland.services.QuestionService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class AnsController {

	@Autowired
	private AnswerService ansService;
	@Autowired
	private GameService gameService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private PlayerService playerService;

	@CrossOrigin
	@PostMapping("/answer")
	public @ResponseBody ResponseEntity<?> save(@RequestBody AnswerBean ansBean) {
		Game game = gameService.findGame(ansBean.getGameId());
		Question question = questionService.findById(ansBean.getQuestioId());
		Player player = playerService.findByOne(ansBean.getPlayerId());
		System.err.println(player.getUsername());
		Answer answer = new Answer();
		answer.setGame(game);
		answer.setPlayer(player);
		answer.setQuestion(question);
		answer.setAnswer(ansBean.getAnswer());

		 return new ResponseEntity<>(ansService.save(answer), HttpStatus.OK);
	
	}

}
