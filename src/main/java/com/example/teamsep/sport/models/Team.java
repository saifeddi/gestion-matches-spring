package com.example.teamsep.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teams")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TEAM_ID")
	private Long id ;
	private String name ;
	private String owner;
	private String fondation ;
	private String country ;
	public Team(Long id, String name, String owner, String fondation, String country) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.fondation = fondation;
		this.country = country;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", owner=" + owner + ", fondation=" + fondation + ", country="
				+ country + "]";
	}
	public Long getId() {
		return id;
	}
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getFondation() {
		return fondation;
	}
	public void setFondation(String fondation) {
		this.fondation = fondation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
