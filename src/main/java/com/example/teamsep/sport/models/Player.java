package com.example.teamsep.sport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PLAYER_ID")
	private Long id ;
	private String name ;
	private int age ;
	private int nbr ;
	private String position ;
	
	public Player(Long id, String name, int age, int nbr, String position) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.nbr = nbr;
		this.position = position;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", nbr=" + nbr + ", position=" + position + "]";
	}

}
