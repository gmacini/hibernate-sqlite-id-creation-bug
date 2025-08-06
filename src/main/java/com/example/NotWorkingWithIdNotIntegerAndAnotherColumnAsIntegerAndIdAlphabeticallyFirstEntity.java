package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "not-working-with-both-fields-integer-and-id-alphabetically-before")
@AllArgsConstructor
@NoArgsConstructor
public class NotWorkingWithIdNotIntegerAndAnotherColumnAsIntegerAndIdAlphabeticallyFirstEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "zanotherColumn")
    private Integer zanotherColumn;
}
