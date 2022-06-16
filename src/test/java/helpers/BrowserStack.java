package helpers;

import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class BrowserStack {

    public static String videoUrl(String sessionId) {
        AndroidBSConfig config = ConfigFactory.create(AndroidBSConfig.class, System.getProperties());
        String login = config.login();
        String password = config.password();
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(login, password)
                .log().all()
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video.url");
    }
}
