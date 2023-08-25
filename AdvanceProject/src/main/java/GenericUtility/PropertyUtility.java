package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements Iautoconstants {
    public FileInputStream file;
    public Properties prop;

    public String readingDataFromPropertyfile(String key) {
        try {
            file = new FileInputStream(PROPERTYFILE);
            prop = new Properties();
            prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(key);
    }
}
