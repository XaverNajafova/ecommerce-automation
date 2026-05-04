package API;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CreateUserTest {

    @Test
    public void shouldCreateUserSuccessfully() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .header("Content-Type", "application/json")
                .body("{\"name\": \"Joanna\", \"job\": \"QA Engineer\"}")
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Joanna"))
                .body("job", equalTo("QA Engineer"));
    }
}