import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class MainPage extends BaseSeleniumPage{


    @FindBy(xpath = "//section[@class='pay']/div/h2")
    private WebElement titlePayment;

    @FindBy(xpath = "//div[@class='pay__partners']/ul/li")
    private List<WebElement> paymentLogos;

    @FindBy(xpath = "//section[@class='pay']/div/a")
    private WebElement moreOfServiceLink;

    @FindBy(id = "connection-phone")
    private WebElement phoneNumField;

    @FindBy(id = "connection-sum")
    private WebElement sumField;

    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private WebElement continueButton;


    public MainPage() {
        driver.get("https://www.mts.by/");
        PageFactory.initElements(driver, this);

    }

    public void acceptCookies() throws InterruptedException {
        try {
            WebElement acceptCookiesButton = driver.findElement(By.id("cookie-agree"));
            if (acceptCookiesButton.isDisplayed()) {
                acceptCookiesButton.click();
            }
        } catch (NoSuchElementException e) {
            Thread.sleep(1000);
            acceptCookies();
        }
    }

    public String getTitle() {
        return titlePayment.getText();
    }

    public Boolean isLogosEmpty(){
        return paymentLogos.isEmpty();
    }

    public String getServiceLink(){
        try {
            if (moreOfServiceLink.isDisplayed()) {
                return moreOfServiceLink.getAttribute("href");
            } else {
                return null;
            }
        } catch (Exception e) {
            return "Link is not present";
        }
    }

    public MainPage fillTheForm(String phoneNumFieldValue, String sumFieldValue) {
        phoneNumField.sendKeys(phoneNumFieldValue);
        sumField.sendKeys(sumFieldValue);
        continueButton.click();
        return null;
    }
}
