package com.mydomain.pages;

import com.codeborne.selenide.SelenideElement;
import com.mydomain.pages.components.AssertsComponent;
import com.mydomain.pages.components.CalendarComponent;
import com.mydomain.pages.components.SubjectInputComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public CalendarComponent calendarComponent = new CalendarComponent();
    public SubjectInputComponent subjectInputComponent = new SubjectInputComponent();
    public AssertsComponent assertsComponent = new AssertsComponent();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            currentAddressInpum = $("#currentAddress"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber"),
            genderSelectMaleInput = $("#genterWrapper").$(byText("Male")),
            genderSelectFemaleInput = $("#genterWrapper").$(byText("Female")),
            genderSelectOtherInput = $("#genterWrapper").$(byText("Other")),
            hobbiesSportInput = $("[for='hobbies-checkbox-1']"),
            hobbiesReadingInput = $("[for='hobbies-checkbox-2']"),
            hobbiesMusicInput = $("[for='hobbies-checkbox-3']"),
            uploadFileInput = $("#uploadPicture"),
            stateFieldSelect = $("#state"),
            stateFieldInput = $("#stateCity-wrapper").$(byText("NCR")),
            cityFieldSelect = $("#city"),
            cityFieldInput = $("#stateCity-wrapper").$(byText("Delhi")),
            submitButtonPush = $("#submit");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationPage randomFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage randomLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage randomUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage randomCurrentAddress(String value) {
        currentAddressInpum.setValue(value);
        return this;
    }

    public RegistrationPage randomUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage genderSelectMale() {
        genderSelectMaleInput.click();
        return this;
    }
    public RegistrationPage genderSelectFemale() {
        genderSelectFemaleInput.click();
        return this;
    }

    public RegistrationPage genderSelectOther() {
        genderSelectOtherInput.click();
        return this;
    }

    public RegistrationPage hobbiesSportsCheckboxSelect() {
        hobbiesSportInput.click();
        return this;
    }

    public RegistrationPage hobbiesReadingCheckboxSelect() {
        hobbiesReadingInput.click();
        return this;
    }

    public RegistrationPage hobbiesMusicCheckboxSelect() {
        hobbiesMusicInput.click();
        return this;
    }

    public RegistrationPage uploadFile(String filePath) {
        uploadFileInput.uploadFromClasspath(filePath);
        return this;
    }

    public RegistrationPage fillStateField() {
        stateFieldSelect.click();
        stateFieldInput.click();
        return this;
    }

    public RegistrationPage fillCityField() {
        cityFieldSelect.click();
        cityFieldInput.click();
        return this;
    }

    public void pushSubmitButton() {
        submitButtonPush.click();
    }
}
