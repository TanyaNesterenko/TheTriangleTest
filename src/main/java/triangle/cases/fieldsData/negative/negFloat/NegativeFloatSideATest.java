package triangle.cases.fieldsData.negative.negFloat;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class NegativeFloatSideATest extends BaseForTests {

    public NegativeFloatSideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomFloat().toString());
        input.inputLengthToSideV(RND.randomFloat().toString());

        Float data = -RND.randomFloat();
        input.inputLengthToSideA(data.toString());
        clicker.clickOk();
        checker.checkSideAField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return " Проверка недопустимости ввода дробного отрицательного числа в поле «Сторона А»";
    }
}

