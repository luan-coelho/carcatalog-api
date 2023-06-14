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
public class Person {

    @Id
    @SequenceGenerator(name = "PERSON_SEQ", sequenceName = "PERSON_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "PERSON_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String login;
    private String password;
}
