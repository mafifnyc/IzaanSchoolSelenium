import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IzaanPage {
    public static void main(String[] args) throws InterruptedException {
        String chromeDriverPath = "C:\\Users\\QAAEB2201\\IdeaProjects\\IzaanSchool\\drivers\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        WebDriver chromeDriver = new ChromeDriver();
//        chromeDriver.manage().window().maximize();
//        String url = "https://www.izaanschool.com/";
//        chromeDriver.get(url);
//        izaanSchoolApplyPage();
        izaanSchoolApplyPageDataInput();
    }
    public static void izaanSchoolApplyPage() throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        String urlApply = "https://www.izaanschool.com/apply";
        chromeDriver.get(urlApply);
        Thread.sleep(1000);
        chromeDriver.findElement(By.xpath("//header/div[1]/a[1]/h6[1]")).click();
//        chromeDriver.get(urlHome);
//        Thread.sleep(1000);
        chromeDriver.navigate().back();
        Thread.sleep(1000);
        chromeDriver.navigate().forward();
        Thread.sleep(1000);
        chromeDriver.navigate().refresh();
        Thread.sleep(1000);
        chromeDriver.close();
    }

    public static void izaanSchoolApplyPageDataInput() throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        String urlApply = "https://www.izaanschool.com/apply";
        chromeDriver.get(urlApply);
        chromeDriver.findElement(By.id("firstname")).sendKeys("John");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("name")).sendKeys("Smith");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("phone")).sendKeys("+1234567890");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("email")).sendKeys("johnsmith123@gmail.com");
        Thread.sleep(1000);
        WebElement countryDropdown = chromeDriver.findElement(By.cssSelector("select[formcontrolname='country']"));
        Thread.sleep(1000);
        Select dropdown = new Select(countryDropdown);
        Thread.sleep(1000);
        dropdown.selectByVisibleText("United States of America(USA)");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("zipCode")).sendKeys("12345");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("firstname")).clear();
        Thread.sleep(1000);
        chromeDriver.close();
    }

}
