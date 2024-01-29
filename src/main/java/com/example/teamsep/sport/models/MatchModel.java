package com.example.teamsep.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matches")
public class MatchModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MATCH_ID")
	private Long id ;
	private int scoreOne ; 
	private int scoreTwo ; 
	private String teamOne ; 
	private String teamTwo ;
	public MatchModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatchModel(int scoreOne, int scoreTwo, String teamOne, String teamTwo) {
		super();
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public Long getId() {
		return id;
	}
	 
	public int getScoreOne() {
		return scoreOne;
	}
	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}
	public int getScoreTwo() {
		return scoreTwo;
	}
	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	@Override
	public String toString() {
		return "MatchModel [id=" + id + ", scoreOne=" + scoreOne + ", scoreTwo=" + scoreTwo + ", teamOne=" + teamOne
				+ ", teamTwo=" + teamTwo + "]";
	}


}
