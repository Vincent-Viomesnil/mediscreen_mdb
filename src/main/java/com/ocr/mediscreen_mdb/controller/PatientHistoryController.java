package com.ocr.mediscreen_mdb.controller;

import com.ocr.mediscreen_mdb.Mediscreen_mdbApplication;
import com.ocr.mediscreen_mdb.exceptions.PatientIntrouvableException;
import com.ocr.mediscreen_mdb.exceptions.PatientNonCreeException;
import com.ocr.mediscreen_mdb.model.PatientHistory;
import com.ocr.mediscreen_mdb.service.PatientHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
public class PatientHistoryController {

        @Autowired
        private PatientHistoryService patientHistoryService;
        private final Logger logger = LoggerFactory.getLogger(Mediscreen_mdbApplication.class);

        //Retrieve patients history list
        @RequestMapping(value = "/PatHistory", method = RequestMethod.GET)
        public List<PatientHistory> patientList() {
            List<PatientHistory> patientHistoryList = patientHistoryService.findAll();
            patientHistoryList.stream().forEach((pHL) -> logger.info(pHL.getLastname()));

            return patientHistoryList;
        }


        @GetMapping(value = "/PatHistory/{lastname}")
        public List<PatientHistory> getPatientByFirstname(@Valid @PathVariable String lastname) {
            List<PatientHistory> patientHistoryList = patientHistoryService.findByLastname(lastname);
            if (patientHistoryList.isEmpty()) {
                throw new PatientIntrouvableException("Patient history with lastname: " + lastname + " is not found");
            }
            patientHistoryList.stream().forEach((pHL) -> logger.info(pHL.getLastname()));

            return patientHistoryList;
        }
        @PostMapping(value = "/PatHistory/add")
        public ResponseEntity<Object> addPatient(@Valid @RequestBody PatientHistory patientHistory) {
            PatientHistory patientAdded = patientHistoryService.addPatientHistorty(patientHistory);
            if (patientHistory != null) {
                return ResponseEntity.ok(patientAdded);
            }
            throw new PatientNonCreeException("Verify the mandatory data");
        }


        @PutMapping(value = "/PatHistory/update/{lastname}")
        public PatientHistory updatePatient(@PathVariable String lastname, @RequestBody PatientHistory patientToUpdate) {
            return patientHistoryService.updatePatient(lastname, patientToUpdate);
        }

        @DeleteMapping(value= "/PatHistory/delete/{lastname}")
        public PatientHistory deletePatient(@PathVariable String lastname) {
            return patientHistoryService.deletePatient(lastname);
        }

    }


