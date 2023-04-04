package br.unitins.mobile.carcatalog.repository;

import br.unitins.mobile.carcatalog.model.FuelType;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FuelTypeRepository implements PanacheRepository<FuelType> {
}
