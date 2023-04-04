package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.Brand;
import br.unitins.mobile.carcatalog.model.Car;
import br.unitins.mobile.carcatalog.model.Category;
import br.unitins.mobile.carcatalog.repository.BrandRepository;
import br.unitins.mobile.carcatalog.repository.CarRepository;
import br.unitins.mobile.carcatalog.repository.CategoryRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import java.util.List;

@ApplicationScoped
public class CarService {

    @Inject
    BrandRepository brandRepository;

    @Inject
    CategoryRepository categoryRepository;

    @Inject
    CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.listAll();
    }

    public Car getById(Long id) {
        return carRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException("Car not found by id"));
    }

    public void create(Car car) {
        if (car.getBrand() == null || car.getBrand().getId() == null) {
            throw new IllegalArgumentException("Brand cannot be null");
        }

        if (car.getCategory() == null || car.getCategory().getId() == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }

        Brand brand = brandRepository.findByIdOptional(car.getId()).orElseThrow(() -> new NotFoundException("Car not found by id"));
        car.setBrand(brand);

        Category category = categoryRepository.findByIdOptional(car.getId()).orElseThrow(() -> new NotFoundException("Category not found by id"));
        car.setCategory(category);

        carRepository.persist(car);
    }
}
