import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

class TestNGE123 {
    WebDriver driver;

    @BeforeTest
    public void lanchChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/index.php");
    }
    @Test(priority = 3)
    public void test1(){
        System.out.println("test1");
    }
    @Test(priority = 1)
    public void test2(){
        System.out.println("test2");
    }
    @Test(priority = -1)
    public void test3(){
        System.out.println("test3");
    }
    @Test(enabled = false)
    public void login() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sravanimeduri66");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@1");
        driver.findElement(By.xpath("//input[@name='login']")).click();
    }

    @Test(enabled = false)
    public void searchHotel(){
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
    }
    @Test(enabled = false)
    public void changePassword(){
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[3]")).click();
    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }
}
