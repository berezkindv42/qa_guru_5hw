package com.mydomain.pages.components;

import static com.codeborne.selenide.Selenide.$;
import static com.mydomain.utils.RandomUtils.getRandomString;

public class SubjectInputComponent {

//    String randomChar = getRandomString(1);

    public void fillSubjectField() {
        $("#subjectsInput").setValue("e");
        $(".subjects-auto-complete__menu #react-select-2-option-0").click();
    }
}
