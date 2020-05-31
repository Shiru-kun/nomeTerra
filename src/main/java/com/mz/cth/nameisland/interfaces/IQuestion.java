package com.mz.cth.nameisland.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mz.cth.nameisland.model.Question;

public interface IQuestion extends JpaRepository<Question, Long>{

	Question findByQuestion(String name);

}
