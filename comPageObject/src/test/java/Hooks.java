import com.PageObject.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void openBrowser()
    {
        new DriverManager().invokeBrowser();

    }

    @After
    public void tearDown()
    {
        new DriverManager().closeBrowser();
    }
}
