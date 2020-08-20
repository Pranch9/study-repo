package ru.pranch.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pranch.springbootapp.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
   List<User> findByUsername(String username);
}
