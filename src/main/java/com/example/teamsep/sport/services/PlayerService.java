package com.example.teamsep.sport.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.teamsep.sport.models.Player;

@Service
public interface PlayerService {
	public List<Player> getAllPlayers();
	public Player getPlayerById(Long id);
	public void deletePlayer(Long id);
	public Player addPlayer(Player player);
	public Player editPlayer(Player player);
}
