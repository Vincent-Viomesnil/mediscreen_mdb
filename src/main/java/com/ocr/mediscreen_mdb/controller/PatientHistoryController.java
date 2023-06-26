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
            return  patientHistoryService.findAll();
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
        public PatientHistory addPatientHistory(@Valid @RequestBody PatientHistory patientHistory) {
            PatientHistory patientAdded = patientHistoryService.addPatientHistory(patientHistory);
            if (patientHistory != null) {
                return ResponseEntity.ok(patientAdded).getBody();
            }
            throw new PatientNonCreeException("Verify the mandatory data");
        }


    @RequestMapping(value = "PatHistory/update", method = RequestMethod.PUT)
        public PatientHistory updatePatientByLastname(@RequestParam("lastname") String lastname, @RequestBody PatientHistory patientToUpdate) {
            return patientHistoryService.updatePatientByLastname(lastname, patientToUpdate);
        }

    @RequestMapping(value="PatHistory/delete", method = RequestMethod.DELETE)
        public PatientHistory deletePatientByLastname(@RequestParam("lastname") String lastname) {
            return patientHistoryService.deletePatientByLastname(lastname);
        }

    @PutMapping(value = "/PatHistory/update/{patId}")
    public PatientHistory updatePatientById(@PathVariable Long patId, @RequestBody PatientHistory patientToUpdate) {
        return patientHistoryService.updatePatientById(patId, patientToUpdate);
    }

    @DeleteMapping(value= "/PatHistory/delete/{patId}")
    public PatientHistory deletePatientById(@PathVariable Long patId) {
        return patientHistoryService.deletePatientyId(patId);
    }

    }


