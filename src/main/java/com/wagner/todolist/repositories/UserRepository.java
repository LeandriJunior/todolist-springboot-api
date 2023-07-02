package com.wagner.todolist.repositories;

import com.wagner.todolist.models.TodoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TodoUser, Long> {

}