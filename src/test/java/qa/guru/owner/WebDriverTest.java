package qa.guru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    @Test
    public void testGithub0() {
        WebDriver driver = getDriver();
        driver.get("https://github.com/");
        String title = driver.getTitle();
        assertEquals("GitHub · Change is constant. GitHub keeps you ahead. · GitHub", title);
        driver.quit();

    }

    @Test
    public void testGithub1() {
        WebDriver driver = getDriver();
        driver.get("https://github.com/");
        String title = driver.getTitle();
        assertEquals("GitHub · Change is constant. GitHub keeps you ahead. · GitHub", title);
        driver.quit();

    }

    private WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
