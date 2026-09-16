package Tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requestBuilder.AdminRequest;

public class adminLoginTest {

    AdminRequest adminRequest = new AdminRequest();

    @Test
    public void testAdminLogin(){
        Response response = adminRequest.adminLogin();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
