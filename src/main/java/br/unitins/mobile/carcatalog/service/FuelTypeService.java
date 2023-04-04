package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.FuelType;
import br.unitins.mobile.carcatalog.repository.FuelTypeRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class FuelTypeService {

    @Inject
    FuelTypeRepository fuelTypeRepository;

    public List<FuelType> getAll() {
        return fuelTypeRepository.listAll();
    }
}
