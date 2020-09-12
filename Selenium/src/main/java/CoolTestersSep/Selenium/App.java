package CoolTestersSep.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Curso Automatización" );
        String exePath = Paths.get("").toAbsolutePath().toString()+ File.separator+ "driver"+File.separator;    // en que carpeta va ir a buscar el driver 
        System.setProperty("webdriver.chrome.driver",exePath + "chromedriver.exe");//establecer  la propiedad del .exe
        WebDriver driver = new ChromeDriver();   // Inicializar el driver
        driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");  //Inciarlizar chrome en la url especiicada 
        
        		
    }
}
