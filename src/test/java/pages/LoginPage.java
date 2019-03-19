package pages;

import commons.Page;
import config.ConstantsUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends Page {

    @FindBy(id = "email")
    private WebElement user;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "entrar")
    private WebElement btnEntrar;

    @FindBy(id = "menu")
    private WebElement menuLogado;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void login(String usuario, String senha) {
        WebDriverWait wait = new WebDriverWait(driver,10000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("entrar")));
        user.sendKeys(usuario);
        password.sendKeys(senha);
        btnEntrar.click();
    }

    public void usuarioLogado(){
        WebDriverWait wait = new WebDriverWait(driver,10000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu")));
    }
}
