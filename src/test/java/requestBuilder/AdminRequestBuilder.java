package requestBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import payloadBuilder.UserPayload;

import static Common.Paths.BASE_URL;

public class AdminRequestBuilder {

    static public String adminToken;

    public static Response adminLoginRequest(String email, String password) {

        String apiPath = "/login";

        Response response = RestAssured.given().
                baseUri(BASE_URL).
                basePath(apiPath).
                header("Content-Type","application/json").
                body(UserPayload.userLoginPayload(email, password)).
                when().
                post().
                then().
                extract().response();

        adminToken = response.jsonPath().getString("data.token");

        System.out.println(adminToken);

        return response;
    }

}
