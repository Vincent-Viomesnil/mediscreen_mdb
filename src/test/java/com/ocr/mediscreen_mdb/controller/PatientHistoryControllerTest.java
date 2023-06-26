//package com.ocr.mediscreen_mdb.controller;
//
//import com.ocr.mediscreen_mdb.exceptions.PatientIntrouvableException;
//import com.ocr.mediscreen_mdb.exceptions.PatientNonCreeException;
//import com.ocr.mediscreen_mdb.model.PatientHistory;
//import com.ocr.mediscreen_mdb.service.PatientHistoryService;
//import org.bson.types.ObjectId;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.ResponseEntity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//public class PatientHistoryControllerTest {
//
//    @Mock
//    private PatientHistoryService patientHistoryService;
//
//    @InjectMocks
//    private PatientHistoryController patientHistoryController;
//
//    private List<PatientHistory> patientHistoryList;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//        patientHistoryList = new ArrayList<>();
//        patientHistoryList.add(new PatientHistory(new ObjectId(), 1L, "Lastname1", "Note 1"));
//        patientHistoryList.add(new PatientHistory(new ObjectId(), 2L, "Lastname2", "Note 2"));
//    }
//
//    @Test
//    public void testGetPatientList() {
//        // Act
//        List<PatientHistory> patientHistoryList = patientHistoryController.patientList();
//
//        // Assert
//        verify(patientHistoryService, times(1)).findAll();
//    }
//
//    @Test
//    public void testGetPatientByLastname_ValidLastname() {
//        // Arrange
//        String lastname = "Lastname1";
//        when(patientHistoryService.findByLastname(lastname)).thenReturn(patientHistoryList);
//
//        // Act
//        PatientHistory result = patientHistoryController.getPatientByLastname(lastname);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(patientHistoryList.get(0).get_id(), result.get_id());
//        assertEquals(patientHistoryList.get(0).getPatId(), result.getPatId());
//        assertEquals(patientHistoryList.get(0).getLastname(), result.getLastname());
//        assertEquals("[Note 1, Note 2]", result.getNotes());
//        verify(patientHistoryService, times(1)).findByLastname(lastname);
//    }
//
//    @Test
//    public void testGetPatientByLastnameInvalid() {
//        // Arrange
//        String lastname = "Invalid";
//        when(patientHistoryService.findByLastname(lastname)).thenReturn(new ArrayList<>());
//
//        // Act & Assert
//        assertThrows(PatientIntrouvableException.class, () -> {
//            patientHistoryController.getPatientByLastname(lastname);
//        });
//        verify(patientHistoryService, times(1)).findByLastname(lastname);
//    }
//
//    @Test
//    public void testAddPatientHistory() {
//        // Arrange
//        PatientHistory patientHistoryToAdd = new PatientHistory(new ObjectId(), 1L, "Lastname1", "Note");
//        when(patientHistoryService.addPatientHistory(patientHistoryToAdd)).thenReturn(patientHistoryToAdd);
//
//        // Act
//        PatientHistory result = patientHistoryController.addPatientHistory(patientHistoryToAdd);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(patientHistoryToAdd, result);
//        verify(patientHistoryService, times(1)).addPatientHistory(patientHistoryToAdd);
//    }
//
//
//    @Test
//    public void testGetPatientById() {
//        // Arrange
//        Long id= 1L;
//        when(patientHistoryService.findByPatId(id)).thenReturn(patientHistoryList);
//
//        // Act
//        PatientHistory result = patientHistoryController.getPatientByPatId(id);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(patientHistoryList.get(0).get_id(), result.get_id());
//        assertEquals(patientHistoryList.get(0).getPatId(), result.getPatId());
//        assertEquals(patientHistoryList.get(0).getLastname(), result.getLastname());
//        assertEquals("[Note 1, Note 2]", result.getNotes());
//        verify(patientHistoryService, times(1)).findByPatId(id);
//    }
//
//
//
//}
//
