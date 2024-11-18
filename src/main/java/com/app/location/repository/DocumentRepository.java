package com.app.location.repository;

import com.app.location.domain.DocumentDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentDomain, Long> {
}
