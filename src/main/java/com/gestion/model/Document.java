package com.gestion.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, columnDefinition = "nvarchar(45)")
	private String nom;

	@Column(nullable = false)
	private Date derniere_date_modification;

	@Column(nullable = false)
	private Long taille_document;

	@Column(nullable = false)
	private Integer version;

	@Column(nullable = false)
	private Byte document_prive;

	@Column(nullable = false, columnDefinition = "nvarchar(45)")
	private String approuve_par;

//	@ManyToOne
//	@JoinColumn(name = "type_document_id")
//	private Type_document type_document;


public Document() {}

	public Document(Integer id, String nom, Date derniere_date_modification, Long taille_document, Integer version, Byte document_prive,
						String approuve_par) {  //String approuve_par, Document_type document_type) {
		super();
		this.id = id;
		this.nom = nom;
		this.derniere_date_modification = derniere_date_modification;
		this.taille_document = taille_document;
		this.version = version;
		this.document_prive = document_prive;
		this.approuve_par = approuve_par;
		//this.document_type = document_type;
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

	public Date getDerniere_date_modification() {
		return derniere_date_modification;
	}

	public void setDerniere_date_modification(Date derniere_date_modification) {
		this.derniere_date_modification = derniere_date_modification;
	}

	public Long getTaille_document() {
		return taille_document;
	}

	public void setTaille_document(Long taille_document) {
		this.taille_document = taille_document;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Byte getDocument_prive() {
		return document_prive;
	}

	public void setDocument_prive(Byte document_prive) {
		this.document_prive = document_prive;
	}

	public String getApprouve_par() {
		return approuve_par;
	}

	public void setApprouve_par(String approuve_par) {
		this.approuve_par = approuve_par;
	}



	@Override
	public String toString() {
		return "Document " +
				"[id=" + id +
				", nom=" + nom +
				", derniere_date_modification=" + derniere_date_modification +
				", taille_document=" + taille_document +
				", version=" + version +
				", document_prive=" + document_prive +
				", approuve_par=" + approuve_par +
				"]";
	}
}
