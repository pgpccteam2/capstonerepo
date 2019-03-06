package capstone.steps;

import capstone.pages.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class AutomationHooks {
    public static String ScenarioName = "";
    public static String scenarioTag = "";

    public AutomationHooks() {
    }

    @Before
    static public void beforeScenario(Scenario scenario) throws Exception {
        System.out.println("Before scenario");
    }

    @After
    static public void afterScenario(Scenario scenario) throws Throwable {
        System.out.println("After scenario ");
        System.out.println("scenario name=" + scenario.getName());
        System.out.println("scenario is =" + scenario.getStatus());
        System.out.println("scenario is =" + scenario.getSourceTagNames());

        WebDriver driver = BasePage.getDriver();
        driver.quit();
    }
}
