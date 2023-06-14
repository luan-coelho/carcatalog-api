package br.unitins.mobile.carcatalog.repository;

import br.unitins.mobile.carcatalog.model.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
    public boolean validCredentials(String login, String password) {
        return count("FROM Person WHERE login = ?1 AND password = ?2", login, password) > 0;
    }
}
