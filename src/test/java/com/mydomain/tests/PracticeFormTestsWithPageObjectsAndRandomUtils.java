package com.mydomain.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import com.github.javafaker.Faker;
import com.mydomain.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTestsWithPageObjectsAndRandomUtils {

    Faker faker = new Faker();
    RegistrationPage registrationPage = new RegistrationPage();
//    String userEmail = getRandomEmail();

    @BeforeAll
    static void beforeAllMethod() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void runTests() {

        registrationPage.openPage()
                .randomFirstName(faker.name().firstName())
                .randomLastName(faker.name().lastName())
                .randomUserEmail(faker.internet().emailAddress())
                .randomCurrentAddress(faker.address().fullAddress())
                .randomUserNumber(faker.phoneNumber().subscriberNumber(10));

        $("#genterWrapper").$(byText("Male")).click();

        registrationPage.calendarComponent.setBirthDate("12", "April", "1961");

        $("#subjectsInput").setValue("e");
        $(".subjects-auto-complete__menu #react-select-2-option-0").click();

        $("label[for=hobbies-checkbox-1]").click();
        $("label[for=hobbies-checkbox-2]").click();
        $("label[for=hobbies-checkbox-3]").click();

        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

//        Asserts
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text("Vasiliy Pupkin"),
                text("vasiliy.p@email.com"),
                text("Male"),
                text("4951234567"),
                text("12 April,1961"),
                text("English"),
                text("Sports, Reading, Music"),
                text("testUploadFile1.png"),
                text("Random address"),
                text("NCR Delhi"));
        $("#closeLargeModal").click();
    }
}
