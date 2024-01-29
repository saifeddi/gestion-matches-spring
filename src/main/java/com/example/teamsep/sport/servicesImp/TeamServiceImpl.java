package com.example.teamsep.sport.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teamsep.sport.models.Team;
import com.example.teamsep.sport.repositories.TeamRepository;
import com.example.teamsep.sport.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepository teamRepo ;
	@Override
	public List<Team> getAllTeams() {
		return teamRepo.findAll();
	}

	@Override
	public Team getTeamById(Long id) {
		Optional<Team> team = teamRepo.findById(id);
		return team.isPresent() ? team.get() : null ;
	}

	@Override
	public void deleteTeam(Long id) {
		teamRepo.deleteById(id);;
		
	}

	@Override
	public Team addTeam(Team team) {
		// TODO Auto-generated method stub
		return teamRepo.save(team);
	}

	@Override
	public Team editTeam(Team team) {
		// TODO Auto-generated method stub
		return teamRepo.save(team);
	}

}
