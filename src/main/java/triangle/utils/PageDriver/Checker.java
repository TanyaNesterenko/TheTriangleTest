package triangle.utils.PageDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import triangle.utils.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Класс управления драйвером
 * Проверяет результаты после ввода данных
 */
public class Checker {
    protected WebDriver driver;

    public Checker(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Метод проверки результата
     * @param result Ожидаемый результат
     */
    public void checkResult(String result) {
        String currentResult = driver.findElement(By.
                xpath("(.//*[normalize-space(text()) and normalize-space(.)='Рузультат'])[1]/following::div[1]")).getText();
        Logger.logger.info("Проверка результата.");
        try {
            assertEquals("Результат неверный", result, currentResult);
            Logger.logger.info("TEST PASSED");
        } catch (AssertionError e) {
            Logger.logger.fail("Тип треугольника неверный. ОР: \"" + result + "\". ФР: \"" + currentResult + "\"");
            Logger.logger.fail("TEST FAILED");
            fail();
        }
    }

    /**
     * Метод проверки сообщения об ошибке в поле "Сторона А"
     * @param result Ожидаемый результат
     */
    public void checkSideAField(String result) {
        String currentResult = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона А'])[1]/following::div[1]")).getText();
        Logger.logger.info("Проверка сообщения об ошибке в поле \"Сторона А\"");
        try {
            assertEquals("Неверное сообщение об ошибке: ", result, currentResult);
            Logger.logger.info("TEST PASSED");
        } catch (AssertionError e) {
            Logger.logger.fail("Неверное сообщение об ошибке в поле \"Сторона А\". ОР: \"" + result + "\". ФР: \"" + currentResult + "\"");
            Logger.logger.fail("TEST FAILED");
            fail();
        }
    }

    /**
     * Метод проверки сообщения об ошибке в поле "Сторона Б"
     * @param result Ожидаемый результат
     */
    public void checkSideBField(String result) {
        String currentResult = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона Б'])[1]/following::div[1]")).getText();
        Logger.logger.info("Проверка сообщения об ошибке в поле \"Сторона Б\"");
        try {
            assertEquals("Неверное сообщение об ошибке: ", result, currentResult);
            Logger.logger.info("TEST PASSED");
        } catch (AssertionError e) {
            Logger.logger.fail("Неверное сообщение об ошибке в поле \"Сторона Б\". ОР: \"" + result + "\". ФР: \"" + currentResult + "\"");
            Logger.logger.fail("TEST FAILED");
            fail();
        }
    }

    /**
     * Метод проверки сообщения об ошибке в поле "Сторона В"
     * @param result Ожидаемый результат
     */
    public void checkSideVField(String result) {
        String currentResult = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сторона В'])[1]/following::div[1]")).getText();
        Logger.logger.info("Проверка сообщения об ошибке в поле \"Сторона В\"");
        try {
            assertEquals("Неверное сообщение об ошибке: ", result, currentResult);
            Logger.logger.info("TEST PASSED");
        } catch (AssertionError e) {
            Logger.logger.fail("Неверное сообщение об ошибке в поле \"Сторона В\". ОР: " + result + "; ФР: " + currentResult);
            Logger.logger.fail("TEST FAILED");
            fail();
        }
    }
}
