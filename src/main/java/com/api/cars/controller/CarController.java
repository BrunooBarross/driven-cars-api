package com.api.cars.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cars.dto.CarDTO;
import com.api.cars.model.Car;
import com.api.cars.repository.CarRepository;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @PostMapping
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO req) {
        repository.save(new Car(req));
        return ResponseEntity.created(null).body(req);
    }

    @GetMapping
    public List<Car> listAll() {
        return repository.findAll();
    }
}
