package requestBuilder;

import io.restassured.response.Response;

import static Common.BasePaths.ndosi_BaseURL;
import static Common.ContentType.contentType;
import static io.restassured.RestAssured.given;
import static payloadBuilder.PayloadBuilder.createUserPayload;

public class RequestBuilder {

    public static Response createUserResponse() {
        Response response = given().
                when().
                body(createUserPayload()).
                contentType(contentType).
                log().all().
                post(ndosi_BaseURL + "/register").
                then().
                log().all().
                extract().response();
        return response;
    }
}
