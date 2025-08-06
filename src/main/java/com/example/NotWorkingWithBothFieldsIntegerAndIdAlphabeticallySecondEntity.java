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
@Table(name = "not-working-with-both-fields-integer-and-id-alphabetically-second")
@AllArgsConstructor
@NoArgsConstructor
public class NotWorkingWithBothFieldsIntegerAndIdAlphabeticallySecondEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "anotherColumn")
    private Integer anotherColumn;
}
