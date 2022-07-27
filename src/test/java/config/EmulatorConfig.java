package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "classpath:properties/device.properties"})
public interface EmulatorConfig extends Config {

    String localUrl();
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
