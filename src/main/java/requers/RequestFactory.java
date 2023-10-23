package requers;

import io.restassured.builder.RequestSpecBuilder;

public class RequestFactory {

    public static RequestSpecBuilder createBaseRequestSpecBuilder() {
        return new RequestSpecBuilder().setBaseUri("https://reqres.in/");
    }
}
