package pageUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public String path = "C:\\Users\\Admin\\IdeaProjects\\SpriteCloud_UI\\Config\\config.properties";
    public Properties prop = new Properties();
    public FileInputStream fis;

    {
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadFile() throws IOException {
        prop.load(fis);
    }

    public String readFile(String property){
        return  prop.getProperty(property);

    }


}
