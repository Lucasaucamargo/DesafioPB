package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class tableInfos extends BasePage{
    @FindBy (xpath = "\"//table/tbody/tr\"")
    private static WebElement table;

    @FindBy(xpath = "//table/tbody/tr")
    private static List<WebElement> rowElements;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]")
    private static WebElement editButtonLinhaUm;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[2]/td[7]/a[1]")
    private static WebElement editButtonLinhaDois;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[3]/td[7]/a[1]")
    private static WebElement editButtonLinhaTres;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[4]/td[7]/a[1]")
    private static WebElement editButtonLinhaQuatro;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[5]/td[7]/a[1]")
    private static WebElement editButtonLinhaCinco;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[6]/td[7]/a[1]")
    private static WebElement editButtonLinhaSeis;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[7]/td[7]/a[1]")
    private static WebElement editButtonLinhaSete;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[8]/td[7]/a[1]")
    private static WebElement editButtonLinhaOito;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[9]/td[7]/a[1]")
    private static WebElement editButtonLinhaNove;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[10]/td[7]/a[1]")
    private static WebElement editButtonLinhaDez;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaUm;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[2]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaDois;
    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[3]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaTres;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[4]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaQuatro;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[5]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaCinco;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[6]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaSeis;


    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[7]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaSete;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[8]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaOito;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[9]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaNove;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[10]/td[7]/a[2]")
    private static WebElement deleteButtonLinhaDez;

    public tableInfos(WebDriver navegador) {
        super(navegador);
    }


        // Validação Table:
        public static void cliqueEditarLinhaUm() {
            editButtonLinhaUm.click();
        }
        public static void cliqueEditarLinhaDois() {
            editButtonLinhaDois.click();
        }
        public static void cliqueEditarLinhaTres() {
            editButtonLinhaTres.click();
        }
        public static void cliqueEditarLinhaQuatro() {
            editButtonLinhaQuatro.click();
        }
        public static void cliqueEditarLinhaCinco() {
            editButtonLinhaCinco.click();
        }

        public static void cliqueEditarLinhaSeis() {
            editButtonLinhaSeis.click();
        }

        public static void cliqueEditarLinhaSete() {
            editButtonLinhaSete.click();
        }
        public static void cliqueEditarLinhaOito() {
            editButtonLinhaOito.click();
        }

        public static void cliqueEditarLinhaNove() {
            editButtonLinhaNove.click();
        }

        public static void cliqueEditarLinhaDez() {
            editButtonLinhaDez.click();
        }

        public static void cliqueDeleteLinhaUm() {
            deleteButtonLinhaUm.click();
        }

        public static void cliqueDeleteLinhaDois() {
            deleteButtonLinhaDois.click();
        }
        public static void cliqueDeleteLinhaTres() {
            deleteButtonLinhaTres.click();
        }
        public static void cliqueDeleteLinhaQuatro() {
            deleteButtonLinhaQuatro.click();
        }
        public static void cliqueDeleteLinhaCinco() {
            deleteButtonLinhaCinco.click();
        }
        public static void cliqueDeleteLinhaSeis() {
            deleteButtonLinhaSeis.click();
        }
        public static void cliqueDeleteLinhaSete() {
            deleteButtonLinhaSete.click();
        }
        public static void cliqueDeleteLinhaOito() {
            deleteButtonLinhaOito.click();
        }
        public static void cliqueDeleteLinhaNove() {
            deleteButtonLinhaNove.click();
        }
        public static void cliqueDeleteLinhaDez() {
            deleteButtonLinhaDez.click();
        }
}



