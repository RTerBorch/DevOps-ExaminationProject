package com.example.DevOpsExaminationProject.controllers;

import com.example.DevOpsExaminationProject.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/car")
    public Car getCar(){
        return new Car();
    }

    @GetMapping("/greet")
    public String greet(){
        return "Hello, World!";
    }
}
