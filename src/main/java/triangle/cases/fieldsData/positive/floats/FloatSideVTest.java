package triangle.cases.fieldsData.positive.floats;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class FloatSideVTest extends BaseForTests {

    public FloatSideVTest() {
        super();
    }

    @Test
    public void testSideVTest() throws Exception {
        input.inputLengthToSideA(RND.randomFloat().toString());
        input.inputLengthToSideB(RND.randomFloat().toString());
        input.inputLengthToSideV(RND.randomFloat().toString());
        clicker.clickOk();
        checker.checkSideVField("");
    }

    @Override
    public String testInfo() {
        return "Проверка допустимости ввода дробного положительного числа в поле «Сторона В»";
    }
}

