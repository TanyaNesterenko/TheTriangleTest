package triangle.cases.fieldsData.negative.symbol;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class SymbolSideATest extends BaseForTests {

    public SymbolSideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        String data = RND.randomSymbols();
        input.inputLengthToSideA(data);
        clicker.clickOk();
        checker.checkSideAField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода символов  в поле «Сторона А»";
    }
}

