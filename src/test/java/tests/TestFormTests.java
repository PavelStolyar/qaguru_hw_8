package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.TestFormPage;

import static io.qameta.allure.Allure.step;

public class TestFormTests extends TestBase{

    TestFormPage testFormPage = new TestFormPage();

    @Test
    void fillFormTestWithPageObject(){
        step("Open student registration form", () -> {
            testFormPage.openPage();
        });

        step("Fill needed fields", () -> {
            testFormPage.fillForm();
        });

        step("Verified form",() -> {
            testFormPage.formVerification();
        });
    }
}
