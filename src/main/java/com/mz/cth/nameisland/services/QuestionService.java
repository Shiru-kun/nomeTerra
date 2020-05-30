package com.mz.cth.nameisland.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.cth.nameisland.interfaces.IQuestion;
import com.mz.cth.nameisland.model.Question;

@Service
public class QuestionService {

	@Autowired
	private IQuestion iQuestion;

	public boolean save(Question question) {

		try {

			iQuestion.save(question);
			return true;

		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}

	public boolean delete(Question question) {

		try {

			iQuestion.delete(question);
			return true;

		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}

	public Question findById(long questionId) {
		return iQuestion.getOne(questionId);

	}

	public List<Question> findAll() {
		return iQuestion.findAll();

	}
}
