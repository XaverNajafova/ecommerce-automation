package API;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsersTest {

    @Test
    public void getUsersTest() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/users")
                .then()
                .statusCode(200);
    }
}