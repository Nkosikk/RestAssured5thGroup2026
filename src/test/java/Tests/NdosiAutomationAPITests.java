package Tests;

import org.testng.annotations.Test;

import static Common.CommonTestData.Creation_Success;
import static requestBuilder.RequestBuilder.createUserResponse;

public class NdosiAutomationAPITests {

    @Test
    public void registerUserTests() {
        createUserResponse().
                then().
                assertThat().
                statusCode(Creation_Success);

    }
}
