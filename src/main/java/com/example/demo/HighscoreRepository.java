package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Highscore;

// This will be AUTO IMPLEMENTED by Spring into a Bean called HighscoreRepository
// CRUD refers Create, Read, Update, Delete

public interface HighscoreRepository extends CrudRepository<Highscore, Long> {

}
