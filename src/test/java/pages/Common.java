package pages;

import utilities.Driver;

public class Common {

    public static void openLink(String url){
        Driver.getDriver().get(url);

    }
}
