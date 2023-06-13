package com.ocr.mediscreen_mdb.service;

import com.ocr.mediscreen_mdb.model.PatientHistory;
import com.ocr.mediscreen_mdb.repository.PatientHistoryDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PatientHistoryService {

    @Autowired
    private PatientHistoryDAO patientHistoryDAO;
    public List<PatientHistory> findAll()  {
        return patientHistoryDAO.findAll();
    }

    public List<PatientHistory> findByLastname(String lastname) {
        return patientHistoryDAO.findByLastname(lastname);
    }

    public PatientHistory addPatientHistorty(PatientHistory patientHistory) {
        return patientHistoryDAO.insert(patientHistory);
    }

    public PatientHistory updatePatient(String lastname, PatientHistory patientHistoryToUpdate) {
        List<PatientHistory> patientHistoryList = patientHistoryDAO.findByLastname(lastname);
        log.info("Patient " + patientHistoryList);
        patientHistoryDAO.save(patientHistoryToUpdate);
        return patientHistoryToUpdate;
    }

    public PatientHistory deletePatient(String lastname) {
        return patientHistoryDAO.deleteByLastname(lastname);
    }

    public List<PatientHistory> findByPatId(Long patId) {
        return patientHistoryDAO.findByPatId(patId);
    }
}
