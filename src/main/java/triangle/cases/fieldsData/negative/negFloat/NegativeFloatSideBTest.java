package triangle.cases.fieldsData.negative.negFloat;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class NegativeFloatSideBTest extends BaseForTests {

    public NegativeFloatSideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomFloat().toString());
        input.inputLengthToSideV(RND.randomFloat().toString());

        Float data = -RND.randomFloat();
        input.inputLengthToSideB(data.toString());
        clicker.clickOk();
        checker.checkSideBField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return " Проверка недопустимости ввода дробного отрицательного числа в поле «Сторона Б»";
    }
}

