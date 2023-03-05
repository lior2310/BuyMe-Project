package PageObject;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }


    By emailFiled =  By.cssSelector("[placeholder='מייל']");
    By passeordFiled = By.cssSelector("[placeholder='סיסמה']");
    By rememberMeButton = By.cssSelector("[aria-labelledby='זכור אותי']");
    By forgotPasswordButton = By.cssSelector("[class='bm-body-2 text-link theme db']");
    By loginButton = By.cssSelector("[gtm='כניסה ל-BUYME']");
    By facebookLoginClick = By.cssSelector("[class='social-btn facebook']");
    By googleLoginClick = By.cssSelector("[class='social-btn google']");
    By enrollment = By.cssSelector("[class='text-link theme']");


    public LoginPage setEmail (String email){
        writeText(emailFiled,email);
        return this;
    }
    public LoginPage setPasseord (String passeord){
        writeText(passeordFiled, passeord);
        return this;
    }
    public LoginPage set (String passeord) {
        writeText(passeordFiled, passeord);
        return this;
    }
        public LoginPage clickSignUp() {
            click(rememberMeButton);
            return this;
        }
    public LoginPage forgotPassword (){
        click(forgotPasswordButton);
        return this;
    }
    public LoginPage login (){
        click(loginButton);
        return this;
    }
    public LoginPage facebookLogin () {
        click(facebookLoginClick);
        return this;
    }
    public LoginPage googleLogin () {
        click(googleLoginClick);
        return this;
    }








    }
