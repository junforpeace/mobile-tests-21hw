package helpers;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({"classpath:credentials.properties"})
public interface AndroidBSConfig extends Config{

    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("baseURL")
    String baseUrl();

    @Key("appURL")
    String appUrl();

    @Key("device")
    String device();

    @Key("os_version")
    String osVersion();

    @Key("project")
    String projectName();

    @Key("build")
    String buildName();

    @Key("name")
    String testName();
}
