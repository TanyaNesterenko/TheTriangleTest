package triangle.cases.fieldsData.negative.negFloat;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class NegativeFloatSideVTest extends BaseForTests {

    public NegativeFloatSideVTest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideA(RND.randomFloat().toString());
        input.inputLengthToSideB(RND.randomFloat().toString());

        Float data = -RND.randomFloat();
        input.inputLengthToSideV(data.toString());
        clicker.clickOk();
        checker.checkSideVField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода дробного отрицательного числа в поле «Сторона В»";
    }
}

