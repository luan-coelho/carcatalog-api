package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.Brand;
import br.unitins.mobile.carcatalog.model.Car;
import br.unitins.mobile.carcatalog.model.Category;
import br.unitins.mobile.carcatalog.repository.BrandRepository;
import br.unitins.mobile.carcatalog.repository.CarRepository;
import br.unitins.mobile.carcatalog.repository.CategoryRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
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

    @Transactional
    public void create(Car car) {
        validateFields(car);
        carRepository.persist(car);
    }

    private void validateFields(Car car) {
        if (car.getBrand() == null || car.getBrand().getId() == null) {
            throw new IllegalArgumentException("Brand cannot be null");
        }

        if (car.getCategory() == null || car.getCategory().getId() == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }

        Long brandId = car.getBrand().getId();
        Brand brand = brandRepository.findByIdOptional(brandId).orElseThrow(() -> new NotFoundException("Car not found by id"));
        car.setBrand(brand);

        Long categoryId = car.getCategory().getId();
        Category category = categoryRepository.findByIdOptional(categoryId).orElseThrow(() -> new NotFoundException("Category not found by id"));
        car.setCategory(category);
    }

    @Transactional
    public void update(Long id, Car car) {
        if (!carRepository.existsById(id)) {
            throw new NotFoundException("Car not found by id");
        }
        validateFields(car);
        car.setId(id);
        carRepository.persist(car);
    }

    @Transactional
    public void deleteById(Long id) {
        if (!carRepository.existsById(id)) {
            throw new NotFoundException("Car not found by id");
        }
        carRepository.deleteById(id);
    }
}
