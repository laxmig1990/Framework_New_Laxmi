package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {

    public static String getData(String Key) throws IOException {
        FileInputStream fp;
        fp=new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/Config.properties");

        Properties prop = new Properties();
        prop.load(fp);

        return prop.getProperty(Key);
    }



}
