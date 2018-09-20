package triangle.utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import triangle.utils.PageDriver.Checker;
import triangle.utils.PageDriver.Clicker;
import triangle.utils.PageDriver.Input;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

/**
 * Базовый класс от которого наследуются все тесты.
 */
public class BaseForTests {
    protected WebDriver driver;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();
    public Checker checker;
    public Clicker clicker;
    public Input input;

    protected BaseForTests() {
    }

    /**
     * Метод выполняющийся перед тестом.
     * Инициализирует драйвер, открывает веб-страницу
     */
    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        init();
        Logger.logger.startTest(testInfo());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://team.cft.ru/triangle/zadanie/triangle.html?token=5011cd2bc80f4c58a36bbf39a573e481");
    }

    /**
     * Метод инициализирующий вспомогательные классы управления веб-страницей
     */
    private void init() {
        checker = new Checker(driver);
        clicker = new Clicker(driver);
        input = new Input(driver);
    }

    /**
     * Метод выполняющийся после теста.
     * Завершает работу драйвера
     */
    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    /**
     * Обязательный метод для всех тестов.
     * Возвращает информацию о тесте для записи в лог.
     */
    public String testInfo() {
        return "Информация о тесте не задана.\n";
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
