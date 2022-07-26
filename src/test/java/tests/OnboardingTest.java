package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

public class OnboardingTest extends TestBase{

    @Tag("onboarding")
    @Test
    void addLanguageTest() {

        step("Add language", () -> {
            $(AppiumBy.accessibilityId("ADD OR EDIT LANGUAGES")).click();
            $(AppiumBy.accessibilityId("")).click();
            $(AppiumBy.accessibilityId("Español")).click();
            $(AppiumBy.accessibilityId("Español")).click();
            $(AppiumBy.className("Español")).shouldHave(Condition.text("Español"));

        });
    }
    @Tag("onboarding")
        @Test
        void goNextStep() {
            step("Info about settings", () -> {
                $(AppiumBy.accessibilityId("Продолжить")).click();
                $(AppiumBy.className("")).shouldHave(Condition.text(""));

            });
        }
    @Tag("onboarding")
    @Test
    void goThirdStep() {
        step("Offer to join", () -> {
            $(AppiumBy.accessibilityId("Продолжить")).click();
            $(AppiumBy.className("")).shouldHave(Condition.text(""));
            $(AppiumBy.className("")).shouldHave(Condition.text(""));

        });
    }
        @Tag("onboarding")
        @Test
        void goFourthStep() {
            step("Send report", () -> {
                $(AppiumBy.accessibilityId("Продолжить")).click();
                $(AppiumBy.className("")).shouldHave(Condition.text(""));
                $(AppiumBy.className("")).shouldHave(Condition.text(""));
                $(AppiumBy.accessibilityId("")).click();
                $(AppiumBy.accessibilityId("Search Wikipedia")).shouldBe(Condition.visible);
            });

        }

}
