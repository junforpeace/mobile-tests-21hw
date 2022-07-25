package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("classpath:properties/emulator.properties")
public interface EmulatorConfig extends Config {

    String baseUrl();

    @Key("platform_name")
    @DefaultValue("android")
    String platformName();

    @Key("device_name")
    @DefaultValue("Pixel 4a API 30")
    String deviceName();

    @Key("platform_version")
    @DefaultValue("11")
    String platformVersion();


}
