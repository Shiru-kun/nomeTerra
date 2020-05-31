package com.mz.cth.nameisland.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mz.cth.nameisland.model.Question;
import com.mz.cth.nameisland.services.QuestionService;



@Component
public class CompleteDatabase  implements ApplicationListener<ContextRefreshedEvent>{

	
	
	@Autowired
	private QuestionService questionService;
	boolean alreadySetup = false;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		if (alreadySetup)
			return;
		createQuestionIfNotFound("Nome");
		createQuestionIfNotFound("Terra");
		createQuestionIfNotFound("Animal");
		createQuestionIfNotFound("Pais");
		createQuestionIfNotFound("Objecto");
	}

	 @Transactional
	    private Question createQuestionIfNotFound(
	      String name) {
	  
		 Question question = questionService.findByQuestion(name);
	        if (question == null) {
	        	question = new Question();
	        	question.setQuestion(name);;
	        	questionService.save(question);
	        }
	        return question;
	    }
}
