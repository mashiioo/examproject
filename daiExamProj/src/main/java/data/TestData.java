package data;

import com.github.javafaker.Faker;

public class TestData {
    public static final String VALID_PHONE_NUMBER = "80633599483";
    public static final String VALID_PASSWORD = "123456qwerty";


    private static Faker faker = new Faker();
    public static final String NEW_FIRST_NAME = faker.name().firstName();

}
