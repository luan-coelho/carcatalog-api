package br.unitins.mobile.carcatalog.repository;

import br.unitins.mobile.carcatalog.model.Car;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarRepository implements PanacheRepository<Car> {

    public boolean existsById(Long id) {
        return count("FROM Car WHERE id = ?1", id) > 0;
    }
}
