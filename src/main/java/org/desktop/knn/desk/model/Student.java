package org.desktop.knn.desk.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq_generator")
    @SequenceGenerator(name = "student_seq_generator", sequenceName = "STUDENT_SEQ", allocationSize = 1)
    private Long id;
    private String name;
    private double grade;
}
