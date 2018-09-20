package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.cases.fieldsData.positive.integer.*;
import triangle.cases.fieldsData.positive.floats.*;

/**
 * Тест-сет
 * Прогон позитивных тестов на проверку вводимых данных
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        IntSideATest.class,
        IntSideBTest.class,
        IntSideVTest.class,
        FloatSideATest.class,
        FloatSideBTest.class,
        FloatSideVTest.class
})
public class PositiveCheckFieldData {
}
