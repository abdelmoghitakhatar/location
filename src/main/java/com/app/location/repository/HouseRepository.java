package com.app.location.repository;

import com.app.location.domain.HouseDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<HouseDomain, Long> {
}
