package requestBuilder;

import io.restassured.response.Response;

import static Common.BasePaths.ndosi_BaseURL;
import static Common.ContentType.contentType;

import static io.restassured.RestAssured.given;
import static payloadBuilder.PayloadBuilder.createUserPayload;

public class RequestBuilder {

    public static Response createUserResponse(String firstName, String lastName, String email, String password, String confirmPassword,String groupId) {
        Response response = given().
                when().
                body(createUserPayload(firstName, lastName, email, password, confirmPassword, groupId)).
                contentType(contentType).
                log().all().
                post(ndosi_BaseURL + "/register").
                then().
                log().all().
                extract().response();
        return response;
    }
}
