package com.mz.cth.nameisland.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.cth.nameisland.interfaces.IAnswer;
import com.mz.cth.nameisland.model.Answer;

@Service
public class AnswerService {

	@Autowired
	private IAnswer iAns;

	public boolean save(Answer ans) {
		try {
			iAns.save(ans);
			return true;

		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}

	public boolean delete(Answer ans) {
		try {
			iAns.delete(ans);
			return true;

		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}

	}

	public Answer findById(long ansId) {

		return iAns.getOne(ansId);

	}

	public List<Answer> findAll() {

		return iAns.findAll();

	}

}
