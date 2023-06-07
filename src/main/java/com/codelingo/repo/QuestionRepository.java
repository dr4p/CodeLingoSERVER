package com.codelingo.repo;

import com.codelingo.model.exam.Question;
import com.codelingo.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository <Question, Long> {

    Set<Question> findByQuiz(Quiz quiz);
}
