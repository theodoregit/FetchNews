
package localservers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalServers {
    
    
    public static void main(String[] args) throws InterruptedException {
        //let's make this functionality sleep for a while and run all over again indefinitely        
        while(1 == 1){
            GetNews latest = new GetNews();
            String heading = latest.heading;
            String news = latest.news;
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://localhost:5000/");
            String title = driver.getTitle();
            String url = driver.getCurrentUrl(); 

            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));

            username.sendKeys("teddy");
            password.sendKeys("teddy123");

            WebElement login = driver.findElement(By.id("man"));
            login.submit();

            WebElement headline = driver.findElement(By.id("headline"));
            WebElement content = driver.findElement(By.id("content"));

            headline.sendKeys(heading);
            content.sendKeys(news);


            WebElement post_button = driver.findElement(By.id("add"));
            post_button.submit();
            
//            driver.close();
            //sleep for about two minutes and update the websites again
            Thread.sleep(100000);
        }
        
        
        
    }
    
}
