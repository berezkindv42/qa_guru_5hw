package com.mydomain.tests;

import com.github.javafaker.Faker;

public class TestData {
    public static Faker faker = new Faker();
    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String userEmail = faker.internet().emailAddress();
    public static String userNumber = faker.phoneNumber().subscriberNumber(10);
    public static String currentAddress = faker.address().fullAddress();
    public static String gender = "Male";
    public static String hobbieSports = "Sports";
    public static String hobbieReading = "Reading";
    public static String hobbieMusic = "Music";
    public static String imgName = "img/1.png";
    public static String subject = "English";
    public static String state = "NCR";
    public static String city = "Delhi";

}
