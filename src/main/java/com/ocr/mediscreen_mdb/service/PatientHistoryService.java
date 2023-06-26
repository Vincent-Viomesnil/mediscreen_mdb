package com.ocr.mediscreen_mdb.service;

import com.ocr.mediscreen_mdb.exceptions.NoteNotFoundException;
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

    public PatientHistory addPatientHistory(PatientHistory patientHistory) {
        return patientHistoryDAO.save(patientHistory);
    }

    public PatientHistory updatePatientById(Long patId, PatientHistory patientHistoryToUpdate) {
        List<PatientHistory> patientHistoryList = patientHistoryDAO.findByPatId(patId);
        log.info("Patient " + patientHistoryList);
        patientHistoryDAO.save(patientHistoryToUpdate);
        return patientHistoryToUpdate;
    }

    public void deleteNoteById(Long id) {
        if (patientHistoryDAO.findById(String.valueOf(id)).isPresent()) {
            patientHistoryDAO.deleteById(String.valueOf(id));
    }
}

    public PatientHistory getNoteById(Long noteId) {
        Optional<PatientHistory> note =  patientHistoryDAO.findByNoteId(noteId);
        if (note.isEmpty()) throw new NoteNotFoundException("Note with id " + noteId + " doesn't exist");
        return note.get();
    }

    public List<PatientHistory> getListNotesByPatId(Long patId) {
        return patientHistoryDAO.findByPatId(patId);
    }
}
