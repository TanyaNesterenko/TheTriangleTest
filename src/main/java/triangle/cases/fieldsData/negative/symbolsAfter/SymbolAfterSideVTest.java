package triangle.cases.fieldsData.negative.symbolsAfter;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class SymbolAfterSideVTest extends BaseForTests {

    public SymbolAfterSideVTest() {
        super();
    }

    @Test
    public void testSideVTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());

        for (int i = 1; i < 9; i++) {
            String data = RND.randomSymbolsAfterNum(i);
            input.inputLengthToSideV(data);
            clicker.clickOk();
            Thread.sleep(100);
            checker.checkSideVField("\'" + data + "\'не является допустимым числом");
        }
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода символов после числа  в поле «Сторона В»";
    }
}

