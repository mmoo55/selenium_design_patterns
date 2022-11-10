package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesTodoist {
    private static GetPropertiesTodoist getPropertiesTodoist= null;
    private String browser;
    private String host;
    private String user;
    private String pwd;

    private GetPropertiesTodoist(){
        Properties properties = new Properties();
        String nameFile="todoist.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if(inputStream!= null){
            try {
                properties.load(inputStream);
                browser=properties.getProperty("browser");
                host=properties.getProperty("host");
                user=properties.getProperty("user");
                pwd=properties.getProperty("pwd");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetPropertiesTodoist getInstance(){
        if (getPropertiesTodoist == null)
            getPropertiesTodoist=new GetPropertiesTodoist();
        return getPropertiesTodoist;
    }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }
}