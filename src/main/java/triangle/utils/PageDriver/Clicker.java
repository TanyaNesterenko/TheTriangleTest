package triangle.utils.PageDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import triangle.utils.Logger;

/**
 * Класс управления драйвером
 * Реализует нажатие на кнопки
 */
public class Clicker {
    protected WebDriver driver;

    public Clicker(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Метод нажатия на кнопку "OK"
     */
    public void clickOk() {
        Logger.logger.info("Нажимает на кнопку OK");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона В'])[1]/following::button[1]")).click();
    }
}
