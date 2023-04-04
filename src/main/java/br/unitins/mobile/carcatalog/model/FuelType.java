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
public class FuelType {

    @Id
    @SequenceGenerator(name = "FUELTYPE_SEQ", sequenceName = "FUELTYPE_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "FUELTYPE_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
}
