package com.codelingo.repo;

import com.codelingo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
