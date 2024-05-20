package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web {
    public static WebDriver createChrome(){
        //Abrindo navegador
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\lcamargo\\canalGerentes\\target\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
    

        //Navegando para a página
        navegador.get("https://the-internet.herokuapp.com/challenging_dom");

        return navegador;
    }


}

