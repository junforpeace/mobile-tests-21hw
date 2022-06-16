package drivers;

import com.codeborne.selenide.WebDriverProvider;
import helpers.AndroidBSConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class BrowserMobileDriver implements WebDriverProvider {
    static AndroidBSConfig config = ConfigFactory.create(AndroidBSConfig.class);

    @Override
    public WebDriver createDriver(Capabilities capabilities) {

        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        // ввести свои данные для авторизации
        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", config.login());
        mutableCapabilities.setCapability("browserstack.key", config.password());
        mutableCapabilities.setCapability("app", config.appUrl());
        //задать девайс и ос мобильного
        mutableCapabilities.setCapability("device", config.device());
        mutableCapabilities.setCapability("os_version", config.osVersion());
        //всякие другие параметры
        mutableCapabilities.setCapability("project", config.projectName());
        mutableCapabilities.setCapability("build", config.buildName());
        mutableCapabilities.setCapability("name", config.testName());
        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }
    public static URL getBrowserstackUrl() {
        try {
            return new URL(config.baseUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}



