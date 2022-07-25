package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("classpath:properties/device.properties")
public interface DeviceConfig extends Config {

    String baseUrl();

    @Key("platform_name")
    @DefaultValue("android")
    String platformName();

    @Key("device_name")
    @DefaultValue("98fe2e2c")
    String deviceName();

    @Key("platform_version")
    @DefaultValue("11")
    String platformVersion();
}
