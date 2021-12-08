import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.FileReader;
import java.io.IOException;

public class PropertiesLoader {

    static PropertiesConfiguration.PropertiesReader config;
    static String[] properties;

    static {
        try {
            config = new PropertiesConfiguration.PropertiesReader(new FileReader("src/main/resources/application.properties"));
            System.out.println(config.readProperty().split("= "));
            properties = config.readProperty().split("= ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPath() {
        return properties[1];
    }
}
