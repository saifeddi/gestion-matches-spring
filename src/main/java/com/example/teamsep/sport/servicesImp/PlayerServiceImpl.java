package com.example.teamsep.sport.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teamsep.sport.models.Player;
 import com.example.teamsep.sport.repositories.PlayerRepository;
import com.example.teamsep.sport.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	  private PlayerRepository player_repo ;
	@Override
	public List<Player> getAllPlayers() {
		return player_repo.findAll() ;
	}

	@Override
	public Player getPlayerById(Long id) {
		Optional<Player> player = player_repo.findById(id);
		return player.isPresent() ?player.get() : null ;
	}

	@Override
	public void deletePlayer(Long id) {
		player_repo.deleteById(id);
		
	}

	@Override
	public Player addPlayer(Player player) {
		 return player_repo.save(player);
	}

	@Override
	public Player editPlayer(Player player) {
		return player_repo.save(player);
	}

}
