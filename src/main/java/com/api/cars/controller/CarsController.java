package com.api.cars.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cars.dto.CarsDTO;

@RestController
@RequestMapping(value = "/cars")
public class CarsController {

    @PostMapping
    public ResponseEntity<CarsDTO> createCars(@RequestBody CarsDTO req) {
        System.out.println(req);
        return ResponseEntity.ok().body(req);
    }
}
