package com.example.teamsep.sport.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.teamsep.sport.models.MatchModel;

@Service
public interface MatchService {

	public List<MatchModel> getAllMatches();
	public MatchModel getMatchById(Long id);
	public void deleteMatch(Long id);
	public MatchModel addMatch(MatchModel m);
	public MatchModel editMatch(MatchModel m);
}
