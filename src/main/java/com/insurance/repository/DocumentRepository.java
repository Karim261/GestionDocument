package com.insurance.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.insurance.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer>{

	@Query("SELECT p FROM Document p WHERE CONCAT(p.id, ' ', p.nomDocument) LIKE %?1%")
	public Page<Document> findAll(String keyword, Pageable pageable);
}
