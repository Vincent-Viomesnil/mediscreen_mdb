package com.ocr.mediscreen_mdb.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PatientHistory {
    @Id
    @NotNull
    private Long id;
    @NotNull
    private String firstname;
    @NotNull
    private String notes;
}
