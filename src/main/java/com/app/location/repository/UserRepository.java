package com.app.location.repository;

import com.app.location.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDomain, Long> {
}
