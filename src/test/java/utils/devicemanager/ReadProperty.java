package utils.devicemanager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;

import static java.util.logging.Logger.getAnonymousLogger;

public class ReadProperty {

    public static String readProperty(String property) {
        try (InputStream input = new FileInputStream("./serenity.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(property);
        } catch (IOException ex) {
            getAnonymousLogger().log(Level.WARNING, ex.getCause().toString());
        }
        return null;
    }

}
