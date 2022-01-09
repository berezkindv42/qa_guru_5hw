package com.mydomain.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.mydomain.tests.TestData.*;

public class AssertsComponent {

    public void assertsForm() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text(firstName + " " + lastName),
                text(userEmail),
                text("Male"),
                text(userNumber),
                text("12 April,1961"),
                text("English"),
                text("Sports, Reading, Music"),
                text("1.png"),
                text(currentAddress),
                text("NCR Delhi"));
        $("#closeLargeModal").click();
    }
}
