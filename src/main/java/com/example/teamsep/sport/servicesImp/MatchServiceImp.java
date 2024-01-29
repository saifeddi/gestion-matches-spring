package com.example.teamsep.sport.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teamsep.sport.models.MatchModel;
import com.example.teamsep.sport.repositories.MatchRepository;
import com.example.teamsep.sport.services.MatchService;

@Service
public class MatchServiceImp  implements MatchService{

	@Autowired
	private MatchRepository matchRepo ;
	
	@Override
	public List<MatchModel> getAllMatches() {
		
 		return matchRepo.findAll();
	}

	@Override
	public MatchModel getMatchById(Long id) {
		// TODO Auto-generated method stub
		Optional<MatchModel> match = matchRepo.findById(id);
		return match.isPresent() ? match.get(): null  ;
	}

	@Override
	public void deleteMatch(Long id) {
		matchRepo.deleteById(id);
		
	}

	@Override
	public MatchModel addMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return matchRepo.save(m);
	}

	@Override
	public MatchModel editMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return matchRepo.save(m);
	}

	
}
