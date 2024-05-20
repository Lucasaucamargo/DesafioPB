package tests;

import Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Web;
import java.time.Duration;

import java.util.List;

public class runTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    /**
     * 
     */
    @Test
    public void testSuite() {
        acessoHomePage();
        clickFirstButton();
        clickSecondButton();
        clickThirdButton();
        cliqueEditLinhaUm();
        cliqueDeleteLinhaUm();
        cliqueEditLinhaDois();
        cliqueDeleteLinhaDois();
        cliqueEditLinhaTres();
        cliqueDeleteLinhaTres();
        cliqueEditLinhaQuatro();
        cliqueDeleteLinhaQuatro();
        cliqueEditLinhaCinco();
        cliqueDeleteLinhaCinco();
        cliqueEditLinhaSeis();
        cliqueDeleteLinhaSeis();
        cliqueEditLinhaSete();
        cliqueDeleteLinhaSete();
        cliqueEditLinhaOito();
        cliqueDeleteLinhaOito();
        cliqueEditLinhaNove();
        cliqueDeleteLinhaNove();
        cliqueEditLinhaDez();
        cliqueDeleteLinhaDez();
    }


    public void acessoHomePage() {
        homePage HomePage = new homePage(navegador);
        String textoTitulo = homePage.textoTitulo();
        String getTitulo = navegador.getTitle();
        Assert.assertEquals("The Internet", getTitulo);
        Assert.assertEquals("Challenging DOM", textoTitulo);
        System.out.println("O Titulo da página é: " + getTitulo);
        System.out.println("O Titulo do desafio é: " + textoTitulo);

    }

    public void clickFirstButton() {
        homePage HomePage = new homePage(navegador);
        String textoFooBotton = homePage.getTextFooButton();
        String initialColor = homePage.getColorFooButton();
        homePage.cliqueFoobotton();
        try {
            Thread.sleep(1000); // Aguarde 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String finalText = homePage.getTextFooButton();
        String finalColor = homePage.getColorFooButton();

        Assertions.assertNotEquals("O texto do Primeiro botão não mudou após o clique!", textoFooBotton, finalText);
        Assertions.assertNotEquals("A cor do Primeiro botão não mudou após o clique!", initialColor, finalColor);


        // Validar que o texto e a cor mudaram
        boolean textChanged = !textoFooBotton.equals(finalText);
        boolean colorChanged = !initialColor.equals(finalColor);

        if (textChanged) {
            System.out.println("O texto do Primeiro botão mudou após o clique.");
        } else {
            System.out.println("O texto do Primeiro botão não mudou após o clique.");
        }

        if (colorChanged) {
            System.out.println("A cor do Primeiro botão mudou após o clique.");
        } else {
            System.out.println("A cor do Primeiro botão não mudou após o clique.");
        }


    }

    public void clickSecondButton() {
        homePage HomePage = new homePage(navegador);
        String textoFooAlertBotton = homePage.getTextFooAlertButton();
        String initialColor = homePage.getColorFooAlertButton();
        homePage.cliqueFoobottonAlert();
        try {
            Thread.sleep(1000); // Aguarde 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String finalText = homePage.getTextFooAlertButton();
        String finalColor = homePage.getColorFooAlertButton();

        Assertions.assertNotEquals("O texto do Segundo botão não mudou após o clique!", textoFooAlertBotton, finalText);
        Assertions.assertNotEquals("A cor do Segundo botão não mudou após o clique!", initialColor, finalColor);


        // Validar que o texto e a cor mudaram
        boolean textChanged = !textoFooAlertBotton.equals(finalText);
        boolean colorChanged = !initialColor.equals(finalColor);

        if (textChanged) {
            System.out.println("O texto do Segundo botão mudou após o clique.");
        } else {
            System.out.println("O texto do Segundo botão não mudou após o clique.");
        }

        if (colorChanged) {
            System.out.println("A cor do Segundo botão mudou após o clique.");
        } else {
            System.out.println("A cor do Segundo botão não mudou após o clique.");
        }


    }


    public void clickThirdButton() {
        homePage HomePage = new homePage(navegador);
        String textoFooSuccessBotton = homePage.getTextFooSuccessButton();
        String initialColor = homePage.getColorFooSuccessButton();
        homePage.cliqueFooSuccessButton();
        try {
            Thread.sleep(1000); // Aguarde 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String finalText = homePage.getTextFooSuccessButton();
        String finalColor = homePage.getColorFooSuccessButton();

        Assertions.assertNotEquals("O texto do Terceiro botão não mudou após o clique!", textoFooSuccessBotton, finalText);
        Assertions.assertNotEquals("A cor do Terceiro botão não mudou após o clique!", initialColor, finalColor);


        // Validar que o texto e a cor mudaram
        boolean textChanged = !textoFooSuccessBotton.equals(finalText);
        boolean colorChanged = !initialColor.equals(finalColor);

        if (textChanged) {
            System.out.println("O texto do Terceiro botão mudou após o clique.");
        } else {
            System.out.println("O texto do Terceiro botão não mudou após o clique.");
        }

        if (colorChanged) {
            System.out.println("A cor do Terceiro botão mudou após o clique.");
        } else {
            System.out.println("A cor do Terceiro botão não mudou após o clique.");
        }


    }

    public void cliqueEditLinhaUm() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaUm();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 1(um), a URL mudou para: " + urlDepois);
    }

    public void cliqueDeleteLinhaUm() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaUm();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 1(um), a URL mudou para: " + urlDepois);
    }


    public void cliqueEditLinhaDois() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaDois();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 2(Dois), a URL mudou para: " + urlDepois);
    }

    public void cliqueDeleteLinhaDois() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaDois();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 2(Dois), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaTres() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaTres();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 3(Três), a URL mudou para: " + urlDepois);
    }
    public void cliqueDeleteLinhaTres() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaTres();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 3(Três), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaQuatro() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaQuatro();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 4(Quatro), a URL mudou para: " + urlDepois);
    }

    public void cliqueDeleteLinhaQuatro() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaQuatro();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 4(Quatro), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaCinco() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaCinco();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 5(Cinco), a URL mudou para: " + urlDepois);
    }
    public void cliqueDeleteLinhaCinco() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaCinco();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 5(Cinco), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaSeis() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaSeis();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 6(Seis), a URL mudou para: " + urlDepois);
    }
    public void cliqueDeleteLinhaSeis() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaSeis();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 6(Seis), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaSete() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaSete();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 7(Sete), a URL mudou para: " + urlDepois);
    }
    public void cliqueDeleteLinhaSete() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaSete();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 7(Sete), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaOito() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaOito();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 8(Oito), a URL mudou para: " + urlDepois);
    }
    public void cliqueDeleteLinhaOito() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaOito();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 8(Oito), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaNove() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaNove();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 9(Nove), a URL mudou para: " + urlDepois);
    }
    public void cliqueDeleteLinhaNove() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaNove();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 9(Nove), a URL mudou para: " + urlDepois);
    }
    public void cliqueEditLinhaDez() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueEditarLinhaDez();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Edit da linha 10(Dez), a URL mudou para: " + urlDepois);
    }
    public void cliqueDeleteLinhaDez() {
        tableInfos Tableinfos = new tableInfos(navegador);
        String urlAntes = navegador.getCurrentUrl();
        Tableinfos.cliqueDeleteLinhaDez();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(
                ExpectedConditions.not(ExpectedConditions.urlToBe(urlAntes)));
        String urlDepois = navegador.getCurrentUrl();
        Assert.assertNotEquals("A URL não mudou após o clique.", urlAntes, urlDepois);
        System.out.println("Após clique no Botão Delete da linha 10(Dez), a URL mudou para: " + urlDepois);
    }


    @After
        public void tearDown() {
        navegador.quit();
    }
}
