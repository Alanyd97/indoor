package com.hidro.system.Dth22.Data.repository;

import com.hidro.system.Dth22.Data.Dth22_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Dth22_repository extends JpaRepository<Dth22_entity, Integer> {
    @Override
    List<Dth22_entity> findAll();
}
