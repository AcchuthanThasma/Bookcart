package Bookcart;

public class Main {
    public static void main(String[] args) {
        webdrivermanager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.agoda.com/?cid=1649895&tag=EdgeFav&ds=N5xUbac5KfBU%2BN1G");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
        Thread.sleep(5);
        WebElement drop = driver.findElement(By.xpath("//div[@class='SearchBoxTextDescription__child']"));
        Actions act = new Actions(driver);
        act.moveToElement(drop).build().perform();
        act.click();

    }
}