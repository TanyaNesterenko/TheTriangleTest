package triangle.cases.fieldsData.negative.symbol;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class SymbolSideVTest extends BaseForTests {

    public SymbolSideVTest() {
        super();
    }

    @Test
    public void testSideVTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());

        String data = RND.randomSymbols();
        input.inputLengthToSideV(data);
        clicker.clickOk();
        checker.checkSideVField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода символов в поле «Сторона В»";
    }
}

