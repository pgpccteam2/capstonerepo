package capstone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage {

    String webURL = "https://medium.com/";

    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    public WebElement btnSignIn;


    public void navigateToHomePage(){
        driver.get(webURL);
    }


    public void click(String btnName){

        if(btnName.toLowerCase().equalsIgnoreCase("sign in")){
          //  case "sign in":
                btnSignIn.click();
            //    break;

        }
    }
}
