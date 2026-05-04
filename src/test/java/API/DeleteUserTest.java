package API;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DeleteUserTest {

    @Test
    public void shouldDeleteUserSuccessfully() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .delete("/users/1")
                .then()
                .statusCode(anyOf(is(200), is(204)));
    }
}