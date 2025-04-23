package topic10Statics.task3Config;

public class Config {
    private static String configVersion;

    static {
        configVersion = "v1.0.0";
    }

    public static String displayConfig() {
        return configVersion;
    }
}
