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
import java.util.Optional;
import java.util.stream.Collectors;
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
            patientHistoryList.stream().forEach((pHL) -> logger.info(pHL.getFirstname()));

            return patientHistoryList;
        }


        @GetMapping(value = "/PatHistory/{firstname}")
        public List<PatientHistory> getPatientByFirstname(@Valid @PathVariable String firstname) {
            List<PatientHistory> patientHistoryList = patientHistoryService.findByFirstname(firstname);
            if (patientHistoryList.isEmpty()) {
                throw new PatientIntrouvableException("Patient history with firstname: " + firstname + " is not found");
            }
            patientHistoryList.stream().forEach((pHL) -> logger.info(pHL.getFirstname()));

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


        @PutMapping(value ="/PatHistory/update/{firstname}" )
        public PatientHistory updatePatient(@PathVariable String firstname, @RequestBody PatientHistory patientToUpdate) {
            return patientHistoryService.updatePatient(firstname, patientToUpdate);
        }

        @DeleteMapping(value="/PatHistory/delete/{firstname}")
        public PatientHistory deletePatient(@PathVariable String firstname) {
            return patientHistoryService.deletePatient(firstname);
        }

    }


