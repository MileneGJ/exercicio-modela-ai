package com.carexercise.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carexercise.api.dto.CarDTO;
import com.carexercise.api.model.Car;
import com.carexercise.api.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> listAll(){
        return repository.findAll();
    }
    
    @PostMapping
    public void createCar(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }
}
