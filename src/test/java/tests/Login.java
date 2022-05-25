package tests;

import org.testng.annotations.Test;
import pages.Common;

public class Login extends BaseTest {

    @Test
    public void openPigu(){
        Common.openLink("https://www.pigu.lt/lt/");

    }
}
