package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUpPage extends BasePage {
    public signUpPage(WebDriver driver) {
        super(driver);
    }
    By firstNameFiled = By.cssSelector("[placeholder='שם פרטי']");
    By emailFiled = By.cssSelector("[placeholder='מייל']");
    By passwordFiled = By.cssSelector("[placeholder='סיסמה']");
    By ConfirmPasswordFiled = By.cssSelector("[placeholder='אימות סיסמה']");
    By agreeBotten = By.cssSelector("[action='register'] div:nth-of-type(5) .fill");
    By confirmsButton = By.cssSelector("[action='register'] div:nth-of-type(6) .fill");
    By singUpButton = By.cssSelector("[gtm='הרשמה ל-BUYME']");
    By EntranceButton = By.cssSelector("[class='text-link theme']");

    public signUpPage setFirstName(String firstName) {
        writeText(firstNameFiled, firstName);
        return this;
    }
    public signUpPage setEmail(String email) {
        writeText(emailFiled, email);
        return this;
    }
    public signUpPage setPassword (String password){
        writeText(passwordFiled,password);
        return this;
    }
    public signUpPage setConfirmPassword (String ConfirmPassword) {
        writeText(ConfirmPasswordFiled, ConfirmPassword);
        return this;
}
    public signUpPage confirmsButton (){
        click(confirmsButton);
        return this;
}
    public signUpPage singUpButton (){
        click(singUpButton);
        return this;
    }
    public signUpPage EntranceButton (){
        click(EntranceButton);
        return this;
    }








}