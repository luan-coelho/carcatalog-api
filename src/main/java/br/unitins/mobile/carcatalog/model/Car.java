package br.unitins.mobile.carcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @SequenceGenerator(name = "CAR_SEQ", sequenceName = "CAR_SEQ")
    @GeneratedValue(generator = "CAR_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String model;
    private int year;
    private String fuelType;
    private double price;
    private String description;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;
}