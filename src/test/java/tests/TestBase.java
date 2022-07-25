package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.BrowserMobileDriver;
import drivers.DeviceMobileDriver;
import drivers.EmulatorMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.sessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {

    static String host = System.getProperty("host", "emulator");
    @BeforeAll
    public static void setup() {
        switch (  host) {
            case ("device"):
                Configuration.browser = DeviceMobileDriver.class.getName();
                break;
            case ("emulator"):
                Configuration.browser = EmulatorMobileDriver.class.getName();
                break;
            case ("browserStack"):
                Configuration.browser = BrowserMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
    addListener("AllureSelenide", new AllureSelenide());
    open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close Driver", Selenide::closeWebDriver);

        if (host.equals("browserStack")) {
            Attach.addVideo(sessionId);

        }
    }

}
