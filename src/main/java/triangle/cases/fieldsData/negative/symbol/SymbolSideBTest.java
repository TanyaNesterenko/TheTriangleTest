package triangle.cases.fieldsData.negative.symbol;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class SymbolSideBTest extends BaseForTests {

    public SymbolSideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        String data = RND.randomSymbols();
        input.inputLengthToSideB(data);
        clicker.clickOk();
        checker.checkSideBField("\'"+ data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo(){
        return "Проверка недопустимости ввода символов в поле «Сторона Б»";
    }
}

