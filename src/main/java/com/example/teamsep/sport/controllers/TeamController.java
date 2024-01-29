package com.example.teamsep.sport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 import com.example.teamsep.sport.models.Team;
import com.example.teamsep.sport.services.TeamService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/teams")
public class TeamController {

	@Autowired
	private TeamService team_serv ;
	@GetMapping
	public List<Team> index()
	{
		return team_serv.getAllTeams();
	}
	@GetMapping("/{team_id}")
	public Team show(@PathVariable Long team_id)
	{
		return team_serv.getTeamById(team_id);
	}
	
	@DeleteMapping("/{team_id}")
	public void delete(@PathVariable Long team_id)
	{
		 team_serv.deleteTeam(team_id);
	}
	@PostMapping
	public Team add(@RequestBody Team team)
	{
		return team_serv.addTeam(team);
	}
	
	@PutMapping
	public Team update(@RequestBody Team team)
	{
		return team_serv.editTeam(team);
	}
}
