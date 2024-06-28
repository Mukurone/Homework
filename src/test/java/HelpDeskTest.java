import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelpDeskTest extends BaseSeleniumTest{



    @Test
    public void checkWork() throws InterruptedException {
        MainPage mainPage = new MainPage();
        String phoneNumFieldValue = "297777777";
        String sumFieldValue = "100";
        mainPage.acceptCookies();
//      mainPage.getTitle();
        assertEquals("Онлайн пополнение без комиссии", mainPage.getTitle().replace("\n", " "));
//      mainPage.isLogosEmpty();
        assertFalse(mainPage.isLogosEmpty());
//        mainPage.getServiceLink();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", mainPage.getServiceLink());
//        mainPage.fillTheForm(phoneNumField, sumField);
        assertNull(mainPage.fillTheForm(phoneNumFieldValue, sumFieldValue));
    }

}
