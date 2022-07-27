package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class OnboardingTest extends TestBase{

    @Tag("onboarding")
    @Test
    void firstPageTest() {
        step("First page checking", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView"))
                    .shouldHave(text("We’ve found the following on your device:"));
        });
    }

    @Disabled
    //@Tag("onboarding")
    @Test
    void addLanguageTest() {

        step("Add language", () -> {
            $(AppiumBy.accessibilityId("ADD OR EDIT LANGUAGES")).click();
            $(AppiumBy.accessibilityId("")).click();
            $(AppiumBy.accessibilityId("Español")).click();
            $(AppiumBy.accessibilityId("Español")).click();
            $(AppiumBy.className("Español")).shouldHave(text("Español"));

        });
    }

    @Tag("onboarding")
    @Test
    void goNextStep() {
        step("Checking Info about settings", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("New ways to explore"));
        });
    }

    @Tag("onboarding")
    @Test
    void goThirdStep() {
        step("Checking 3rd page Offer to join", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Reading lists with sync"));
            $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered")).shouldBe(visible);

        });
    }

    @Tag("onboarding")
    @Test
    void goFourthStep() {
        step("Checking 4th page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/switchView")).shouldBe(visible);
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button"))
                    .shouldHave(text("GET STARTED")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).shouldBe(visible);
        });

    }

}
