package Practical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);

		driver.get("http://127.0.0.1:5500/index.html");

		String myTitle = driver.getTitle();

		System.out.println(myTitle);

		List<WebElement> myOptions = driver.findElements(By.tagName("option"));

		for (int i = 0; i < myOptions.size(); i++) {
			System.out.println(myOptions.get(i).getText());

		}

	}

}
