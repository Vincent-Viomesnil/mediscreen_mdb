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
import java.util.stream.Collectors;
import javax.validation.Valid;

@RestController
public class PatientHistoryController {

        @Autowired
        private PatientHistoryService patientHistoryService;
        private final Logger logger = LoggerFactory.getLogger(Mediscreen_mdbApplication.class);

        //Retrieve patients history list
        @GetMapping(value = "/PatHistoryList")
        public List<PatientHistory> patientList() {
            List<PatientHistory> patientHistoryList = patientHistoryService.findAll();
            patientHistoryList.stream().forEach((pHL) -> logger.info(pHL.getLastname()));

            return patientHistoryList;
        }

@GetMapping(value = "/PatHistory/lastname/{lastname}")
public PatientHistory getPatientByLastname(@Valid @PathVariable String lastname) {
    List<PatientHistory> patientHistoryList = patientHistoryService.findByLastname(lastname);
    if (patientHistoryList.isEmpty()) {
        throw new PatientIntrouvableException("Patient history not found");
    }

    PatientHistory patientHistory = new PatientHistory();
    patientHistory.set_id(patientHistoryList.get(0).get_id());
    patientHistory.setPatId(patientHistoryList.get(0).getPatId());
    patientHistory.setLastname(patientHistoryList.get(0).getLastname());

    List<String> notes = patientHistoryList.stream()
            .map(PatientHistory::getNotes)
            .collect(Collectors.toList());
    patientHistory.setNotes(notes.toString());

    return patientHistory;
}
    @GetMapping(value = "/PatHistory/id/{patId}")
    public PatientHistory getPatientByPatId(@Valid @PathVariable Long patId) {
        List<PatientHistory> patientHistoryList = patientHistoryService.findByPatId(patId);
        if (patientHistoryList.isEmpty()) {
            throw new PatientIntrouvableException("Patient history not found");
        }

        PatientHistory patientHistory = new PatientHistory();
        patientHistory.set_id(patientHistoryList.get(0).get_id());
        patientHistory.setPatId(patientHistoryList.get(0).getPatId());
        patientHistory.setLastname(patientHistoryList.get(0).getLastname());

        List<String> notes = patientHistoryList.stream()
                .map(PatientHistory::getNotes)
                .collect(Collectors.toList());
        patientHistory.setNotes(notes.toString());

        return patientHistory;
    }


        @PostMapping(value = "/PatHistory/add")
        public PatientHistory addPatient(@Valid @RequestBody PatientHistory patientHistory) {
            PatientHistory patientAdded = patientHistoryService.addPatientHistory(patientHistory);
            if (patientHistory != null) {
                return ResponseEntity.ok(patientAdded).getBody();
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


