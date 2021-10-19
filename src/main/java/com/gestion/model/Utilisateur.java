package com.gestion.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, columnDefinition = "nvarchar(20)")
	private String nomUtilisateur;

	@Column(nullable = false)
	private String motDePasse;

	@Column(nullable = false)
	private String nom;

	@Column(nullable = false)
	private String prenom;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private Date dateNaissance;

public Utilisateur() {}

	public Utilisateur(Integer id) {
		super();
		this.id = id;
	}

	public Utilisateur(String nomUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Utilisateur " +
				"[id=" + id +
				", nomUtilisateur=" + nomUtilisateur +
				", nom=" + nom +
				", prenom=" + prenom +
				", email=" + email +
				", dateNaissance=" + dateNaissance +
				", motDePasse=" + motDePasse +
				"]";
	}
}
