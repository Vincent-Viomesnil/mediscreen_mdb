package com.ocr.mediscreen_mdb.repository;

import com.ocr.mediscreen_mdb.model.PatientHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientHistoryDAO extends MongoRepository<PatientHistory, String> {
    List<PatientHistory> findAll();
    List<PatientHistory> findByLastname(String lastname);
    PatientHistory insert(PatientHistory patientHistory);

    PatientHistory save(PatientHistory patientHistoryToUpdate);

    PatientHistory deleteByLastname(String lastname);
    PatientHistory deleteByPatId(Long patId);
    List<PatientHistory> findByPatId(Long patId);
}
