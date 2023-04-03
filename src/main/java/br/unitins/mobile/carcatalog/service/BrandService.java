package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.Brand;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BrandService {

    List<Brand> brands = new ArrayList<>();

    @PostConstruct
    public void init() {
        Brand toyota = new Brand(1, "Toyota");
        Brand honda = new Brand(2, "Honda");
        Brand tesla = new Brand(3, "Tesla");

        brands.add(toyota);
        brands.add(honda);
        brands.add(tesla);
    }

    public List<Brand> getAll() {
        return brands;
    }
}
