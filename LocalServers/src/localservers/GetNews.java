
package localservers;
import static java.lang.Integer.parseInt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNews {
    public double viewCount; //it had to be int
    public String heading, news;
    public GetNews(){
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.bbc.com/news"); //first website
//        WebElement view1 = driver1.findElement(By.id("count1"));
        WebElement heading1 = driver1.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/div/div/a/h3"));
        WebElement news1 = driver1.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/div/div/p"));
//        int count1 = parseInt(view1.getText());
        double count1 = Math.random();
        viewCount = count1;
        heading = heading1.getText();
        news = news1.getText();
        driver1.close();

        
        WebDriver driver3 = new ChromeDriver();        
        driver3.get("https://www.aljazeera.com/"); //third website
//        WebElement view3 = driver3.findElement(By.id("count1"));
        WebElement heading3 = driver3.findElement(By.className("top-sec-title"));
        WebElement news3 = driver3.findElement(By.className("top-sec-desc"));
//        int count3 = parseInt(view3.getText());
        double count3 = Math.random();
        if(count3 > viewCount){
            viewCount = count3;
            heading = heading3.getText();
            news = news3.getText();
        }
        driver3.close();
        /*
        WebDriver driver4 = new ChromeDriver();        
        driver4.get("https://www.washingtontimes.com/"); //forth website
//        WebElement view4 = driver4.findElement(By.id("count1"));
        WebElement heading4 = driver4.findElement(By.className("article-headline"));
        WebElement news4 = driver4.findElement(By.xpath("html/body/div/div/section/div/div/section/article/div/div/p"));
//        int count4 = parseInt(view4.getText());
        double count4 = Math.random();
        if(count4 > viewCount){
            viewCount = count4;
            heading = heading4.getText();
            news = news4.getText();
        }
        driver4.close();*/
    }
}
