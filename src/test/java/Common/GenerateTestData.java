package Common;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class GenerateTestData {

    static Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = firstName + "." + lastName + "@gmail.com";
    public String password = faker.internet().password(8, 10, true, true, true);
    public String confirmPassword = password;


}
