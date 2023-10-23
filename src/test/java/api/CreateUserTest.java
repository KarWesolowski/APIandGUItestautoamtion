package api;

import org.junit.jupiter.api.Test;
import requers.RequestFactory;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CreateUserTest {

    private static String CREATE_USER_PATH = "/api/users";
    private static String NAME = "Hire";
    private static String JOB = "Me";
    private static String CREATE_USER_BODY = "{\"name\":\""+ NAME +"\",\"job\":\"" + JOB + "\"}";

    @Test
    public void createUserTest() {
        given()
                .spec(RequestFactory.createBaseRequestSpecBuilder().setBasePath(CREATE_USER_PATH).setBody(CREATE_USER_BODY).setContentType("application/json").build())
                .log().all().
        when()
                .post().
        then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo(NAME))
                .body("job", equalTo(JOB));
    }
}
