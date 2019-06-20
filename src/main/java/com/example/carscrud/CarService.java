package com.example.carscrud;

import java.util.Collection;

public interface CarService {
    public abstract Car saveCar(Car car);

    public abstract void deleteCar(Long id);

    public abstract Car getOneCar(Long id);

    public abstract Collection<Car> getAllCars();

    public abstract Collection<Car> coolCars();
}