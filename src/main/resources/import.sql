INSERT INTO category (id, name)
VALUES (1, 'Sedan'),
       (2, 'SUV'),
       (3, 'Hatchback');

INSERT INTO brand (id, name)
VALUES (1, 'Toyota'),
       (2, 'Honda'),
       (3, 'Tesla');

INSERT INTO car (id, model, year, fueltype, price, description, brand_id, category_id)
VALUES (1, 'Corolla', 2020, 'Gasoline', 18000, 'Well-maintained used car.', 1, 1),
       (2, 'Civic', 2019, 'Gasoline', 17000, 'Low mileage, great condition.', 2, 2),
       (3, 'Model 3', 2021, 'Electric', 45000, 'Like new, electric vehicle.', 3, 3);

