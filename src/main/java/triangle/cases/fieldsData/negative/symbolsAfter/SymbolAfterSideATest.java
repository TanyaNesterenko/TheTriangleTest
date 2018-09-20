package triangle.cases.fieldsData.negative.symbolsAfter;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class SymbolAfterSideATest extends BaseForTests {

    public SymbolAfterSideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        for (int i = 1; i <9 ; i++) {
            String data = RND.randomSymbolsAfterNum(i);
            input.inputLengthToSideA(data);
            clicker.clickOk();
            Thread.sleep(100);
            checker.checkSideAField("\'"+ data + "\'не является допустимым числом");
        }
    }

    @Override
    public String testInfo(){
        return "Проверка недопустимости ввода символов после числа  в поле «Сторона А»";
    }
}

