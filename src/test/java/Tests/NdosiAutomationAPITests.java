package Tests;

import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.GenerateTestData.*;
import static Common.GenerateTestData.password;
import static requestBuilder.RequestBuilder.createUserResponse;

public class NdosiAutomationAPITests {

    @Test
    public void registerUserTests() {
        createUserResponse(firstName, lastName, email, password, confirmPassword, groupId).
                then().
                assertThat().
                statusCode(Creation_Success);
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
}
