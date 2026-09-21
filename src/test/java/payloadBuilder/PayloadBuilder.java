package payloadBuilder;

import com.google.gson.JsonObject;
import org.testng.annotations.Test;

import static Common.GenerateTestData.*;

public class PayloadBuilder {



    public static JsonObject createUserPayload() {
        JsonObject userObject = new JsonObject();
        userObject.addProperty("firstName", firstName);
        userObject.addProperty("lastName", lastName);
        userObject.addProperty("groupId", "f552e054-8b24-41c2-a0ce-24018a205783");
        userObject.addProperty("email", email);
        userObject.addProperty("password", password);
        userObject.addProperty("confirmPassword", confirmPassword);

        return userObject;
    }

}
