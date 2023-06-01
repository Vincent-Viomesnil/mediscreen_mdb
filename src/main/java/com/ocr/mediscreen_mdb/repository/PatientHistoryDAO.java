package com.ocr.mediscreen_mdb.repository;

import com.ocr.mediscreen_mdb.model.PatientHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientHistoryDAO extends JpaRepository<PatientHistory, Long> {
    public List<PatientHistory> findAll();

    Optional<PatientHistory> findByFirstname(String firstname);
}
