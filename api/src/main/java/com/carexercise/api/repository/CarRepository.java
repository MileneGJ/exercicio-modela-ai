package com.carexercise.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carexercise.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
