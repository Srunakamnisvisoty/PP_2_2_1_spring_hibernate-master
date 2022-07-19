package hiber.service;

import hiber.model.Car;

import java.util.List;

public interface CarService {

    Car save(Car car);

    Car findById(Long id);

    List<Car> findAll();
}
