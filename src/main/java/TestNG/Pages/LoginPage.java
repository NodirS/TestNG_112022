package TestNG.Pages;

import TestNG.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindAll({
            @FindBy(id="prependedInput"),
            @FindBy(name="_username"),
    })
    public WebElement usernameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
