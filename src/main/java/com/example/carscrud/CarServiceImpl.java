package com.example.carscrud;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public Car getOneCar(Long id) {
        return carRepository.findById(id).get();
    }

    @Override
    public Collection<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Collection<Car> coolCars() {
        return carRepository.findAll().stream().filter(this::isCool).collect(Collectors.toList());
    }

    private boolean isCool(Car car) {
        return !car.getName().equals("AMC Gremlin") && !car.getName().equals("Triumph Stag")
                && !car.getName().equals("Ford Pinto") && !car.getName().equals("Yugo GV");
    }
}