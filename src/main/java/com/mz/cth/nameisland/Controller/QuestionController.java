package com.mz.cth.nameisland.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mz.cth.nameisland.services.QuestionService;

@RestController
@RequestMapping("/api")
public class QuestionController {

	
	@Autowired
	private QuestionService questionService;
	
	@CrossOrigin
	@GetMapping("/questions")
	public @ResponseBody ResponseEntity<?> getAll() {

		return new ResponseEntity<>(questionService.findAll(), HttpStatus.OK);

	}
}
