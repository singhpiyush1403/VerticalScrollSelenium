
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerticalScroll {

	public static void main(String[] args) throws InterruptedException   {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
	

	}

}
