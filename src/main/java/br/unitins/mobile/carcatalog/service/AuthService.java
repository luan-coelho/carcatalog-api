package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.dto.AuthRequest;
import br.unitins.mobile.carcatalog.dto.RegisterRequest;
import br.unitins.mobile.carcatalog.model.Person;
import br.unitins.mobile.carcatalog.repository.PersonRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class AuthService {

    @Inject
    PersonRepository personRepository;

    public boolean validCredentials(AuthRequest request) {
        return personRepository.validCredentials(request.login(), request.password());
    }

    @Transactional
    public Person register(RegisterRequest request) {
        Person person = new Person(request);
        personRepository.persist(person);
        return person;
    }
}
