package tests;

import org.testng.annotations.Test;
import utils.Driver;

public class Demo extends BaseTest {
    @Test
    public void openPigu(){
        Driver.getDriver().get("https://www.pigu.lt/lt/");
    }
}
