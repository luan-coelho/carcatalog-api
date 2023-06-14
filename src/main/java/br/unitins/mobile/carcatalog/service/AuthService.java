package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.repository.PersonRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AuthService {

    @Inject
    PersonRepository personRepository;

    public boolean validCredentials(String login, String password) {
        return personRepository.validCredentials(login, password);
    }
}
