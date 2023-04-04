INSERT INTO fueltype (id, name)
VALUES (nextval('fueltype_seq'), 'Diesel'),
       (nextval('fueltype_seq'), 'Hybrid'),
       (nextval('fueltype_seq'), 'Flex'),
       (nextval('fueltype_seq'), 'Ethanol'),
       (nextval('fueltype_seq'), 'Natural Gas'),
       (nextval('fueltype_seq'), 'Electric');

INSERT INTO category (id, name)
VALUES (nextval('category_seq'), 'Sedan'),
       (nextval('category_seq'), 'SUV'),
       (nextval('category_seq'), 'Hatchback');

INSERT INTO brand (id, name)
VALUES (nextval('brand_seq'), 'Toyota'),
       (nextval('brand_seq'), 'Honda'),
       (nextval('brand_seq'), 'Tesla');

INSERT INTO car (id, model, year, fueltype_id, price, description, brand_id, category_id)
VALUES (nextval('car_seq'), 'Corolla', 2020, 1, 18000, 'Well-maintained used car.', 1, 1),
       (nextval('car_seq'), 'Civic', 2019, 2, 17000, 'Low mileage, great condition.', 2, 2),
       (nextval('car_seq'), 'Model 3', 2021, 3, 45000, 'Like new, electric vehicle.', 3, 3);