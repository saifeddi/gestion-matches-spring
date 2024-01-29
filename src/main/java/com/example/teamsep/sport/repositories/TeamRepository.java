package com.example.teamsep.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teamsep.sport.models.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
