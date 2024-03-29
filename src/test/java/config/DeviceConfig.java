package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "classpath:properties/device.properties"})
public interface DeviceConfig extends Config {

    @Key("localUrl")
    String localUrl();

    @Key("platform_name")
    @DefaultValue("android")
    String platformName();

    @Key("device_name")
    @DefaultValue("98fe2e2c")
    String deviceName();

    @Key("platform_version")
    @DefaultValue("11")
    String platformVersion();

    String host();
}
