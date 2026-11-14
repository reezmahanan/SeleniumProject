package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class testinghandout {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /*@Test
    public void TC01_pageTitle() {
        driver.get("https://the-internet.herokuapp.com");
        String actualTitle = driver.getTitle();

    }*/

    // TC02: Valid login
    /*@Test
    public void TC02_validLogin() {
        driver.get("http://localhost:5173/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String flashMessage = driver.findElement(By.id("flash")).getText();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(flashMessage.contains("You logged into a secure area!"), "Login message mismatch!");
        Assert.assertTrue(currentUrl.contains("/secure"), "URL does not contain /secure!");
    }/*


    // TC03: Wrong password
   /* @Test
    public void TC03_wrongPassword() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("wrong");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String flashMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(flashMessage.contains("Your password is invalid!"), "Error message mismatch!");
    }*/

    // TC04: Wrong username
    /*@Test
    public void TC04_wrongUsername() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("wronguser");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String flashMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(flashMessage.contains("Your username is invalid!"), "Error message mismatch!");
    }*/


    // TC05: Empty fields
    /*@Test
    public void TC05_emptyFields() {
        driver.get("https://the-internet.herokuapp.com/login");
        // Leave fields blank and click login directly
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String flashMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(flashMessage.contains("Your username is invalid!"), "Error message mismatch!");
    }*/
// TC06: Logout
    /*@Test
    public void TC06_logout() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Click Logout
        driver.findElement(By.cssSelector("a[href='/logout']")).click();

        String flashMessage = driver.findElement(By.id("flash")).getText();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("/login"), "Did not return to login page!");
        Assert.assertTrue(flashMessage.contains("You logged out of the secure area!"), "Logout message mismatch!");
    }*/

    // TC07: Tick and untick checkboxes
    /*@Test
    public void TC07_checkboxes() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        WebElement checkbox1 = checkboxes.get(0);
        WebElement checkbox2 = checkboxes.get(1);

        // Select checkbox 1 if not selected
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
        // Deselect checkbox 2 if selected
        if (checkbox2.isSelected()) {
            checkbox2.click();
        }

        Assert.assertTrue(checkbox1.isSelected(), "Checkbox 1 is not selected!");
        Assert.assertFalse(checkbox2.isSelected(), "Checkbox 2 is selected!");
    }*/

    // TC08: Select an option from dropdown
    /*@Test
    public void TC08_dropdown() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropdownElement);

        dropdown.selectByVisibleText("Option 2");

        String selectedOptionText = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOptionText, "Option 2", "Selected option text mismatch!");
    }*/
    // TC09: Type and clear a number
    /*@Test
    public void TC09_inputs() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.tagName("input"));

        inputField.sendKeys("123");
        Assert.assertEquals(inputField.getAttribute("value"), "123", "Input value is not 123!");

        inputField.clear();
        Assert.assertTrue(inputField.getAttribute("value").isEmpty(), "Input field is not empty!");
    }*/
    // TC10: JavaScript Alert handling
    @Test
    public void TC10_javascriptAlert() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();


        driver.switchTo().alert().accept();


        String resultText = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultText, "You successfully clicked an alert", "Alert result message mismatch!");
    }

}