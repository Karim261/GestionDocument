package com.insurance.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.springframework.*;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, columnDefinition = "nvarchar(20)")
	private String nomDocument;
	
public Document() {}
	
	public Document(Integer id) {
		super();
		this.id = id;
	}
	
	public Document(String nomDocument) {
		super();
		this.nomDocument = nomDocument;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

		
	public String getNomDocument() {
		return nomDocument;
	}

	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}

	@Override
	public String toString() {
		return "Document " +
				"[id=" + id +
				", nomDocument=" + nomDocument +
				"]";
	}
}
