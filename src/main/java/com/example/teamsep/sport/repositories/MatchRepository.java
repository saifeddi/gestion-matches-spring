package com.example.teamsep.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teamsep.sport.models.MatchModel;

@Repository
public interface MatchRepository extends JpaRepository<MatchModel, Long>{

}
