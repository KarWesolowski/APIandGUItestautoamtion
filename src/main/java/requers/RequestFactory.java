package requers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestFactory {

    private RequestSpecification requestSpecification;
    private static RequestSpecBuilder INSTANCE;

    public static RequestSpecBuilder getInstance(){
       INSTANCE = new RequestSpecBuilder();
       return INSTANCE;
    }

    public static RequestSpecBuilder createBaseRequestSpecBuilder() {
        return new RequestSpecBuilder().setBaseUri("https://reqres.in/");
    }
}
