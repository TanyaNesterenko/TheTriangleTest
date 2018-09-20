package triangle.utils.PageDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import triangle.utils.Logger;

/**
 * Класс управления драйвером
 * Реализует ввод данных в поля
 */
public class Input {
    protected WebDriver driver;

    public Input(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Метод ввода данных в поле "Сторона А"
     */
    public void inputLengthToSideA(String length) {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона А'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона А'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона А'])[1]/following::input[1]")).sendKeys(length);
        Logger.logger.info("В поле \"Сторона А\" введена длина " + length);
    }

    /**
     * Метод ввода данных в поле "Сторона Б"
     */
    public void inputLengthToSideV(String length) {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона В'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона В'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона В'])[1]/following::input[1]")).sendKeys(length);
        Logger.logger.info("В поле \"Сторона В\" введена длина " + length);
    }

    /**
     * Метод ввода данных в поле "Сторона В"
     */
    public void inputLengthToSideB(String length) {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона Б'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона Б'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона Б'])[1]/following::input[1]")).sendKeys(length);
        Logger.logger.info("В поле \"Сторона Б\" введена длина " + length);
    }
}
