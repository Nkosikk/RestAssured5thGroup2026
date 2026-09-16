package requestBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import payloadBuilder.UserPayload;

import static Common.Paths.BASE_URL;

public class AdminRequestBuilder {

    static public String adminUserName = "admin@gmail.com";
    static public String adminPassword = "@12345678";
    static public String adminToken;

    public static Response adminLoginRequest() {

        String apiPath = "/login";

        Response response = RestAssured.given().
                baseUri(BASE_URL).
                basePath(apiPath).
                header("Content-Type","application/json").
                body(UserPayload.userLoginPayload(adminUserName, adminPassword)).
                when().
                post().
                then().
                extract().response();

        return response;
    }

}
