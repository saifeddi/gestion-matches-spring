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

import com.example.teamsep.sport.models.Player;
import com.example.teamsep.sport.services.PlayerService;
@RequestMapping("api/players")
@CrossOrigin("*")

@RestController
public class PlayerController {
	@Autowired
	private PlayerService player_service ;
	@GetMapping
	public List<Player> index()
	{
		return player_service.getAllPlayers();
	}
	@GetMapping("/{player_id}")
	public Player show(@PathVariable Long player_id)
	{
		return player_service.getPlayerById(player_id);
	}
	
	@DeleteMapping("/{player_id}")
	public void delete(@PathVariable Long player_id)
	{
		player_service.deletePlayer(player_id);
	}
	@PostMapping
	public Player add(@RequestBody Player player)
	{
		return player_service.addPlayer(player);
	}
	
	@PutMapping
	public Player update(@RequestBody Player player)
	{
		return player_service.editPlayer(player);
	}
}
