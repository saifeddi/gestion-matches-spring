package com.example.teamsep.sport.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.teamsep.sport.models.Team;

 @Service
public interface TeamService {
	public List<Team> getAllTeams();
	public Team getTeamById(Long id);
	public void deleteTeam(Long id);
	public Team addTeam(Team team);
	public Team editTeam(Team team);
}
