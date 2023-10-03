import io.restassured.RestAssured;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingSystemTest {


    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    @Test
    void greet_shouldReturnHelloWorld() {
        given().port(8080)
                .when().get("/greet")
                .then().body(equalTo("Hello, World!"));
    }
}