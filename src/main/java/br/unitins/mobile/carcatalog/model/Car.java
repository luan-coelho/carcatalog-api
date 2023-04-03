package br.unitins.mobile.carcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private int id;
    private String model;
    private int year;
    private String fuelType;
    private double price;
    private String description;
    private Brand brand;
    private Category category;
}