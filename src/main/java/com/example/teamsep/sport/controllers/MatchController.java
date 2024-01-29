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

import com.example.teamsep.sport.models.MatchModel;
import com.example.teamsep.sport.services.MatchService;

@RequestMapping("api/matches")
@CrossOrigin("*")
@RestController
public class MatchController {
	
	@Autowired
	private MatchService matchService ;

	@GetMapping
	public List<MatchModel> getAllMatches()
	{
		return matchService.getAllMatches();
	}
	@GetMapping("/{match_id}")
	public MatchModel show(@PathVariable Long match_id)
	{
		return matchService.getMatchById(match_id);
	}
	
	@DeleteMapping("/{match_id}")
	public void delete(@PathVariable Long match_id)
	{
		 matchService.deleteMatch(match_id);
	}
	@PostMapping
	public MatchModel add(@RequestBody MatchModel match)
	{
		return matchService.addMatch(match);
	}
	
	@PutMapping
	public MatchModel update(@RequestBody MatchModel match)
	{
		return matchService.editMatch(match);
	}
	
}
