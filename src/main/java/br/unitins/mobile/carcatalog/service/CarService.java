package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.Brand;
import br.unitins.mobile.carcatalog.model.Car;
import br.unitins.mobile.carcatalog.model.Category;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {

    @Inject
    BrandService brandService;

    @Inject
    CategoryService categoryService;

    List<Car> cars = new ArrayList<>();

    @PostConstruct
    public void init() {
        List<Brand> brands = brandService.getAll();
        List<Category> categories = categoryService.getAll();

        Car car1 = new Car(1, "Corolla", 2020, "Gasoline", 18000, "Well-maintained used car.", brands.get(0), categories.get(0));
        Car car2 = new Car(2, "Civic", 2019, "Gasoline", 17000, "Low mileage, great condition.", brands.get(1), categories.get(1));
        Car car3 = new Car(3, "Model 3", 2021, "Electric", 45000, "Like new, electric vehicle.", brands.get(2), categories.get(2));

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    public List<Car> getAll() {
        return cars;
    }

    public Car getById(Long id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        throw new NotFoundException("Car not found by id");
    }

    public void create(Car car) {
        car.setId(cars.size() + 1);
        cars.add(car);
    }
}
