package com.maria.marvel.repository;

import com.maria.marvel.model.ConsultaLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaLogRepository extends JpaRepository<ConsultaLog, String> {
}
