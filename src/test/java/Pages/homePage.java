package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends BasePage{
@FindBy (xpath = "//*[@class=\"button\"]")
private static WebElement fooButton;

@FindBy (xpath = "//*[@class=\"button alert\"]")
private static WebElement fooAlert;

@FindBy (xpath = "//*[@class=\"button success\"]")
private static WebElement fooSuccess;

@FindBy (tagName = "h3")
private static WebElement tituloDesafio;

    public homePage(WebDriver navegador) {
        super(navegador);
    }
        public void HomePage(WebDriver navegador) {
            this.navegador = navegador;
        }

        // Primeiro botão - Metódos:
        public static String getTextFooButton() {
            return fooButton.getText();
        }
        public static String getColorFooButton() {
            return fooButton.getCssValue("background-color");
        }
        public static void cliqueFoobotton() {
            fooButton.click();
        }

        // Segundo botão - Metódos:
        public static String getTextFooAlertButton() {
            return fooAlert.getText();
        }
        public static String getColorFooAlertButton() {
            return fooAlert.getCssValue("background-color");
        }
        public static void cliqueFoobottonAlert() {
            fooAlert.click();
        }


        // Terceiro botão - Metódos:
        public static String getTextFooSuccessButton() {
            return fooSuccess.getText();
         }
        public static String getColorFooSuccessButton() {
            return fooSuccess.getCssValue("background-color");

        }
         public static void cliqueFooSuccessButton() {
            fooSuccess.click();
        }


        //Pegar titulo da página
        public static String textoTitulo() {
            return tituloDesafio.getText();

        }

}



