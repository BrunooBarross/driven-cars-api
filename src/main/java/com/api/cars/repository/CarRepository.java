package com.api.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cars.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
