package com.example.DevOpsExaminationProject;

import io.restassured.RestAssured;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static org.hamcrest.Matchers.equalTo;


class CarSystemTest {

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost";
        port = port;
    }

    @Test
    void greet_shouldReturnHelloWorld() {
        given().port(8080)
                .when().get("/greet")
                .then().body(equalTo("Hello, World!"));
    }

}