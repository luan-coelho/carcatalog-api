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
    @SequenceGenerator(name = "CAR_SEQ", sequenceName = "CAR_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "CAR_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String model;
    private int year;
    @ManyToOne
    private FuelType fuelType;
    private double price;
    private String description;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;

    public static Car copyProperties(Car source, Car target) {
        source.model = target.model;
        source.year = target.year;
        source.brand = target.brand;
        source.category = target.category;
        source.fuelType = target.fuelType;
        source.price = target.price;
        source.description = target.description;
        return source;
    }
}