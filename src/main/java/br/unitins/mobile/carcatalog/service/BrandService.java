package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.Brand;
import br.unitins.mobile.carcatalog.repository.BrandRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class BrandService {

    @Inject
    BrandRepository brandRepository;

    public List<Brand> getAll() {
        return brandRepository.listAll();
    }
}
