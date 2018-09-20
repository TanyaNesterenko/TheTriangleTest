package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Тест-сет
 * Прогон всех тестов проекта
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        PositiveCheckFieldData.class,
        NegativeCheckFieldData.class,
        CheckTringlesType.class
})
public class Suits {

}