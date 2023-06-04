package com.ocr.mediscreen_mdb.repository;

import com.ocr.mediscreen_mdb.model.PatientHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientHistoryDAO extends MongoRepository<PatientHistory, String> {
    List<PatientHistory> findAll();
    List<PatientHistory> findByFirstname(String firstname);
    PatientHistory insert(PatientHistory patientHistory);

    PatientHistory save(PatientHistory patientHistoryToUpdate);

    PatientHistory deleteByFirstname(String firstname);
}
