package triangle.cases.fieldsData.negative.negInt;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class NegativeIntSideATest extends BaseForTests {

    public NegativeIntSideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        Integer data = -RND.randomInteger();
        input.inputLengthToSideA(data.toString());
        clicker.clickOk();
        checker.checkSideAField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода целого отрицательного числа в поле «Сторона А»";
    }
}

