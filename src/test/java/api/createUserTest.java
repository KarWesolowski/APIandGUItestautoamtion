package api;

import org.junit.jupiter.api.Test;
import requers.RequestFactory;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class createUserTest {

    private String createUsersPath = "/api/users";
    private String name = "Hire";
    private String job = "Me";
    private String createUserBody = "{\"name\":\""+name+"\",\"job\":\"" + job + "\"}";

    @Test
    public void createUserTest() {
        given()
                .spec(RequestFactory.createBaseRequestSpecBuilder().setBasePath(createUsersPath).setBody(createUserBody).setContentType("application/json").build())
                .log().all().
        when()
                .post().
        then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo(name))
                .body("job", equalTo(job));
    }
}
