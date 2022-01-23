package com.mydomain.tests;

import com.codeborne.selenide.Configuration;
import com.mydomain.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.mydomain.tests.TestData.*;

public class PracticeFormTestsWithPageObjectsAndFaker {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAllMethod() {
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTests() {

        registrationPage
                .openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmail(userEmail)
                .typeUserNumber(userNumber)
                .typeCurrentAddress(currentAddress)
                .fillSubjectField(subject)
                .genderSelectGender(gender)
                .hobbiesCheckBoxSelect(hobbiesSports)
                .hobbiesCheckBoxSelect(hobbiesReading)
                .hobbiesCheckBoxSelect(hobbiesMusic)
                .uploadFile("img/1.png")
                .fillStateField()
                .fillCityField();
        registrationPage.calendarComponent.setBirthDate("12", "April", "1961");
        registrationPage.pushSubmitButton();
//        Asserts
        registrationPage
                .assertFormTitle("Thanks for submitting the form")
                .assertsForm("Student Name", firstName + " " + lastName)
                .assertsForm("Student Email", userEmail)
                .assertsForm("Gender", gender)
                .assertsForm("Mobile",userNumber)
                .assertsForm("Date of Birth", "12 April,1961")
                .assertsForm("Subjects", subject)
                .assertsForm("Hobbies", hobbiesSports + "," + " " + hobbiesReading + "," + " " + hobbiesMusic)
                .assertsForm("Picture", "1.png")
                .assertsForm("Address", currentAddress)
                .assertsForm("State and City", state + " " + city)
                .closeTable();
        registrationPage.assertFormTitleNegative();
    }
}
