package Pages;

// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static WebDriver navegador;

    public BasePage(WebDriver navegador){
       this.navegador = navegador;
       PageFactory.initElements(navegador, this);
    }
}
