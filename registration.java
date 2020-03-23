import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/Facebook-Project/");
		driver.findElement(By.id("firstname")).sendKeys("yunika");
		driver.findElement(By.id("surname")).sendKeys("kadayat");
		driver.findElement(By.id("phone_email")).sendKeys("kadayatyunika747@gmail.com");
		driver.findElement(By.id("newpassword")).sendKeys("yunika123");
		driver.findElement(By.id("birthday")).sendKeys("27");
		driver.findElement(By.id("birthmonth")).sendKeys("JUN");
		driver.findElement(By.id("birthyear")).sendKeys("1999");
		driver.findElement(By.id("gender_male")).click();
		driver.findElement(By.id("signup")).click();
	}

}
