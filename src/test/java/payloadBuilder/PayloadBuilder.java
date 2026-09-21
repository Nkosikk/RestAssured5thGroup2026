package payloadBuilder;

import com.google.gson.JsonObject;
import org.testng.annotations.Test;

public class PayloadBuilder {



    public static JsonObject createUserPayload() {
        JsonObject userObject = new JsonObject();
        userObject.addProperty("firstName", "Nkosi");
        userObject.addProperty("lastName", "Ndosi");
        userObject.addProperty("groupId", "0321f54a-64e2-4dbf-acf6-ab9614738149");
        userObject.addProperty("email", "nkosicele1@gmail.com");
        userObject.addProperty("password", "@12345678");
        userObject.addProperty("confirmPassword", "@12345678");

        return userObject;
    }

}
