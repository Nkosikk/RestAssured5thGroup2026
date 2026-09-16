package payloadBuilder;

import org.json.simple.JSONObject;

public class UserPayload {

    public static JSONObject userLoginPayload(String email, String password) {
        JSONObject userLogin = new JSONObject();
        userLogin.put("username", email);
        userLogin.put("password", password);

        return userLogin;
    }
}
