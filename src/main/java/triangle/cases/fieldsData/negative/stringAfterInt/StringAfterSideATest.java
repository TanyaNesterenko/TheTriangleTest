package triangle.cases.fieldsData.negative.stringAfterInt;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class StringAfterSideATest extends BaseForTests {

    public StringAfterSideATest() {
        super();
    }

    @Test
    public void stringAfterSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());
        for (int i = 1; i < 9; i++) {
            String data = RND.randomStringAfterNum(i);
            input.inputLengthToSideA(data);
            clicker.clickOk();
            Thread.sleep(100);
            checker.checkSideAField("\'" + data + "\'не является допустимым числом");
        }
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода букв после числа  в поле «Сторона А»";
    }
}

