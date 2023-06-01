package com.ocr.mediscreen_mdb.service;

import com.ocr.mediscreen_mdb.model.PatientHistory;
import com.ocr.mediscreen_mdb.repository.PatientHistoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientHistoryService {

    @Autowired
    private PatientHistoryDAO patientHistoryDAO;
    public List<PatientHistory> findAll()  {
        return patientHistoryDAO.findAll();
    }

    public Optional<PatientHistory> findByFirstname(String firstname) {
        return patientHistoryDAO.findByFirstname(firstname);
    }

}
