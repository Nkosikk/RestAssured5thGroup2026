package Tests;

import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.GenerateTestData.*;
import static Common.GenerateTestData.password;
import static requestBuilder.RequestBuilder.*;

public class NdosiAutomationAPITests {

    @Test
    public void registerUserTests() {
        createUserResponse(firstName, lastName, email, password, confirmPassword, groupId).
                then().
                assertThat().
                statusCode(Creation_Success);
    }

    @Test(dependsOnMethods = "registerUserTests")
    public void loginAsAdminUserTests() {
        loginrResponse(adminUsername, adminPassword).
                then().
                assertThat().
                statusCode(Success_Status);
    }

    @Test(dependsOnMethods = "loginAsAdminUserTests")
    public void approveUserTests() {
        approveUser().
                then().
                assertThat().
                statusCode(Success_Status);
    }




    @Test()
    public void registerUserWithDifferentPasswordTests() {
        createUserResponse(firstName, lastName, email, password, confirmPassword+1, groupId).
                then().
                assertThat().
                statusCode(badRequest);
    }
    @Test(dependsOnMethods = "registerUserTests")
    public void registerUserWithExistingEmailAddressTests() {
        createUserResponse(firstName, lastName, email, password, confirmPassword, groupId).
                then().
                assertThat().
                statusCode(badRequest);
    }

    @Test
    public void registerUserWithIncorrectGroupIdTests() {
        createUserResponse(firstName, lastName, email, password, confirmPassword, groupId+000).
                then().
                assertThat().
                statusCode(badRequest);
    }




}
