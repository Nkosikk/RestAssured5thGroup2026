package Common;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class GenerateTestData {

    static Faker faker = new Faker();

    public String randomName = faker.address().country();

    @Test
    public void print(){
        System.out.println("Random Name: " + randomName);
    }
}
