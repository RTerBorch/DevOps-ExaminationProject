package com.example.DevOpsExaminationProject.controllers;

import com.example.DevOpsExaminationProject.Car;
import com.example.DevOpsExaminationProject.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/car")
    public Car getCar() {
        return new Car();
    }

    @GetMapping("/greet")
    public String greet() {
        return carService.greet();
    }
}
