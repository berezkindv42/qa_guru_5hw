package com.mydomain.tests;

import com.codeborne.selenide.Configuration;
import com.mydomain.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.mydomain.tests.TestData.*;

public class PracticeFormTestsWithPageObjectsAndRandomUtils {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAllMethod() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTests() {

        registrationPage.openPage()
                .randomFirstName(firstName)
                .randomLastName(lastName)
                .randomUserEmail(userEmail)
                .randomUserNumber(userNumber)
                .randomCurrentAddress(currentAddress)
                .genderSelectMale()
                .hobbiesSportsCheckboxSelect()
                .hobbiesReadingCheckboxSelect()
                .hobbiesMusicCheckboxSelect().uploadFile("img/1.png")
                .fillStateField()
                .fillCityField();
        registrationPage.calendarComponent.setBirthDate("12", "April", "1961");
        registrationPage.subjectInputComponent.fillSubjectField();
        registrationPage.pushSubmitButton();
//        Asserts
        registrationPage.assertsComponent.assertsForm();
    }
}
