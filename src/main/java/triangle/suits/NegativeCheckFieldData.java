package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.cases.fieldsData.negative.empty.*;
import triangle.cases.fieldsData.negative.negFloat.*;
import triangle.cases.fieldsData.negative.negInt.*;
import triangle.cases.fieldsData.negative.string.*;
import triangle.cases.fieldsData.negative.stringAfterInt.*;
import triangle.cases.fieldsData.negative.symbol.*;
import triangle.cases.fieldsData.negative.symbolsAfter.*;

@RunWith(Suite.class)

/**
 * Тест-сет
 * Прогон негативных тестов на проверку вводимых данных
 */
@Suite.SuiteClasses({
        EmptySideATest.class,
        EmptySideBTest.class,
        EmptySideVTest.class,
        NegativeFloatSideATest.class,
        NegativeFloatSideBTest.class,
        NegativeFloatSideVTest.class,
        NegativeIntSideATest.class,
        NegativeIntSideBTest.class,
        NegativeIntSideVTest.class,
        StringSideATest.class,
        StringSideBTest.class,
        StringSideVTest.class,
        StringAfterSideATest.class,
        StringAfterSideBTest.class,
        StringAfterSideVTest.class,
        SymbolSideATest.class,
        SymbolSideBTest.class,
        SymbolSideVTest.class,
        SymbolAfterSideATest.class,
        SymbolAfterSideBTest.class,
        SymbolAfterSideVTest.class
})
public class NegativeCheckFieldData {
}
