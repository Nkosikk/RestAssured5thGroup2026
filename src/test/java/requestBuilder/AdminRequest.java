package requestBuilder;

import io.restassured.response.Response;

public class AdminRequest {

    public static String adminEmail = "admin@gmail.com";
    public static String adminPassword = "@12345678";

    public Response adminLogin() {
        Response response = AdminRequestBuilder.adminLoginRequest(adminEmail, adminPassword);
        return response;
    }
}
