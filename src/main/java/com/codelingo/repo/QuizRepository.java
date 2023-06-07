package com.codelingo.repo;

import com.codelingo.model.exam.Category;
import com.codelingo.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    public List<Quiz> findByCategory(Category category);
    public List<Quiz> findByActive(boolean b);
    public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}
