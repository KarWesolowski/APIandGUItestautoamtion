package api;

import org.junit.jupiter.api.Test;
import requers.RequestFactory;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUsersTest {

    private static String GET_USER_PATH = "/api/users";


    @Test
    public void getUsersTest() {
        given()
                .spec(RequestFactory.createBaseRequestSpecBuilder().setBasePath(GET_USER_PATH).build()).
        when()
                .get().
        then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("page", equalTo(1))
                .body("total", equalTo(12))
                .body("data[0].id", equalTo(1))
                .body("data[1].id", equalTo(2))
                .body("data[2].id", equalTo(3))
                .body("data[3].id", equalTo(4))
                .body("data[4].id", equalTo(5))
                .body("data[5].id", equalTo(6));
    }

    @Test
    public void getUsersPagingTest() {
        given()
                .spec(RequestFactory.createBaseRequestSpecBuilder().setBasePath(GET_USER_PATH).addQueryParam("page",2).build()).
        when()
                .get().
        then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("page", equalTo(2))
                .body("total", equalTo(12))
                .body("data[0].id", equalTo(7))
                .body("data[1].id", equalTo(8))
                .body("data[2].id", equalTo(9))
                .body("data[3].id", equalTo(10))
                .body("data[4].id", equalTo(11))
                .body("data[5].id", equalTo(12));
    }
}
