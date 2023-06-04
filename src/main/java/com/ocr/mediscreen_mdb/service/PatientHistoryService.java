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

    public List<PatientHistory> findByFirstname(String firstname) {
        return patientHistoryDAO.findByFirstname(firstname);
    }

    public PatientHistory addPatientHistorty(PatientHistory patientHistory) {
        return patientHistoryDAO.insert(patientHistory);
    }

    public PatientHistory updatePatient(String firstname, PatientHistory patientHistoryToUpdate) {
        List<PatientHistory> patientHistoryList = patientHistoryDAO.findByFirstname(firstname);
        log.info("Patient " + patientHistoryList);
        patientHistoryDAO.save(patientHistoryToUpdate);
        return patientHistoryToUpdate;
    }

    public PatientHistory deletePatient(String firstname) {
        return patientHistoryDAO.deleteByFirstname(firstname);
    }
}
