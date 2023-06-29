package com.ocr.mediscreen_mdb.controller;

import com.ocr.mediscreen_mdb.Mediscreen_mdbApplication;

import com.ocr.mediscreen_mdb.model.PatientHistory;
import com.ocr.mediscreen_mdb.service.PatientHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PatientHistoryController {

        @Autowired
        private PatientHistoryService patientHistoryService;
        private final Logger logger = LoggerFactory.getLogger(Mediscreen_mdbApplication.class);


    @GetMapping(value = "/PatHistoryList")
        public List<PatientHistory> patientList() {
            return  patientHistoryService.findAll();
        }

    @GetMapping(value = "/PatHistory/patid/{patId}")
    public List<PatientHistory> getListNotesByPatId(@PathVariable Long patId) {
        return patientHistoryService.getListNotesByPatId(patId);

    }
    @GetMapping(value = "/PatHistory/noteid/{noteId}")
    public PatientHistory getNoteById(@PathVariable Long noteId) {
        return patientHistoryService.getNoteById(noteId);
    }


    @PostMapping(value = "/PatHistory/add")
        public PatientHistory addNote(@RequestBody PatientHistory patientHistory) {

          return  patientHistoryService.addPatientHistory(patientHistory);
        }


    @PutMapping("/PatHistory/update/{id}")
    public PatientHistory updateNoteById(@PathVariable Long id,
                           @RequestBody PatientHistory patientNoteToUpdate)  {
        PatientHistory noteUpdated = patientHistoryService.getNoteById(id);
        noteUpdated.setNotes(patientNoteToUpdate.getNotes());
        return patientHistoryService.updateNoteById(noteUpdated);
    }


    @DeleteMapping(value= "/PatHistory/delete/{noteId}")
    public void deleteNoteById(@PathVariable Long noteId) {
         patientHistoryService.deleteNoteById(noteId);
    }

    }





