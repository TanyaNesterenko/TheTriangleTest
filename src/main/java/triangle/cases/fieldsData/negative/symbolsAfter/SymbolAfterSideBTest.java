package triangle.cases.fieldsData.negative.symbolsAfter;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class SymbolAfterSideBTest extends BaseForTests {

    public SymbolAfterSideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        for (int i = 1; i < 9; i++) {
            String data = RND.randomSymbolsAfterNum(i);
            input.inputLengthToSideB(data);
            clicker.clickOk();
            Thread.sleep(100);
            checker.checkSideBField("\'" + data + "\'не является допустимым числом");
        }
    }

    @Override
    public String testInfo() {
        return " Проверка недопустимости ввода символов после числа  в поле «Сторона Б»";
    }
}

