package com.example.carscrud;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
class CoolCarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public Collection<Car> cars() {
        return carService.getAllCars();
    }

    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carService.saveCar(car);
    }

    @DeleteMapping("/cars/{id}")
    public boolean deleteCar(@PathVariable Long id) {
        try {
            carService.deleteCar(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @GetMapping("/cars/{id}")
    public Car car(@PathVariable Long id) {
        return carService.getOneCar(id);
    }

    @GetMapping("/cool-cars")
    public Collection<Car> coolCars() {
        return carService.coolCars();
    }
}