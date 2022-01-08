package com.mydomain.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import com.mydomain.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public CalendarComponent calendarComponent = new CalendarComponent();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            currentAddressInpum = $("#currentAddress"),
            userEmailInput = $("#userEmail");
    SelenideElement userNumberInput = $("#userNumber");

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



}
