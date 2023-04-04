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
public class Brand {

    @Id
    @SequenceGenerator(name = "BRAND_SEQ", sequenceName = "BRAND_SEQ")
    @GeneratedValue(generator = "BRAND_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
}
