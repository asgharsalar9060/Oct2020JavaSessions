package StreamsInJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStream {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//
//		By industry = By.id("Form_submitForm_Industry");
//		By country = By.id("Form_submitForm_Country");

//		By indust_options = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		By links = By.tagName("a");

		List<WebElement> indust_list = driver.findElements(links);

		long startTime = System.currentTimeMillis();
		
		// sequential stream
		//indust_list.stream().forEach(ele -> System.out.println(ele.getText()));//558 -- 10831

		// parallel stream
		indust_list.parallelStream().forEach(ele -> System.out.println(ele.getText()));//735 -- 8323

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
