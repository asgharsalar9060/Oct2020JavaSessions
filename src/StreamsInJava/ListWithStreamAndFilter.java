package StreamsInJava;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreamAndFilter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		By links = By.tagName("a");

		List<WebElement> indust_list = driver.findElements(links);
		
		System.out.println(indust_list.size());
		
//		List<String> collectList = indust_list
//				.stream()
//				.filter(ele -> !ele.getText().equals(""))
//				.map(ele -> ele.getText())
//				.collect(Collectors.toList());
//		collectList.stream().forEach(ele -> System.out.println(ele));
		
		List<String> collectList = indust_list
				.stream()
				.filter(ele -> !ele.getText().isEmpty())
				.filter(ele -> !ele.getText().startsWith(" "))
				.map(ele -> ele.getText().trim())
				.collect(Collectors.toList());
		collectList.stream().forEach(ele -> System.out.println(ele));
		
		//collectList.parallelStream().forEach(ele -> System.out.println(ele));
	}
	
	
	
	
	
}
