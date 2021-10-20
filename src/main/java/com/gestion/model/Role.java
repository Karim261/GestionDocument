package com.gestion.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, columnDefinition = "nvarchar(20)")
	private String description;

	@Column(nullable = false)
	private String nom;

	@Column(nullable = false)
	private String rolecol;


public Role() {}

	public Role(Integer id) {
		super();
		this.id = id;
	}

	public Role(String nom) {
		super();
		this.nom = nom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRolecol() {
		return rolecol;
	}

	public void setRolecol(String rolecol) {
		this.rolecol = rolecol;
	}

	@Override
	public String toString() {
		return "Utilisateur " +
				"[id=" + id +
				", nom=" + nom +
				", description=" + description +
				", rolecol=" + rolecol +
				"]";
	}
}
