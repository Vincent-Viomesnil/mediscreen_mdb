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
//
//
//        @PutMapping(value ="/Patient/update/{firstname}" )
//        public Patient updatePatient(@PathVariable String firstname, @RequestBody Patient patientToUpdate) {
//            return patientService.updatePatient(firstname, patientToUpdate);
//        }
//
//        @DeleteMapping(value="/Patient/delete/{firstname}")
//        public Patient deletePatient(@PathVariable String firstname) {
//            return patientService.deletePatient(firstname);
//        }
//
//    }

}
