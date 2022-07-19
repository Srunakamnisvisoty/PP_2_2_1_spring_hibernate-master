package hiber.dao;

import hiber.model.Car;

import java.util.List;

public interface CarDao {

    Car save(Car car);

    Car findById(Long id);

    List<Car> findAll();
}
