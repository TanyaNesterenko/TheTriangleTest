package triangle.cases.fieldsData.negative.negInt;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class NegativeIntSideBTest extends BaseForTests {

    public NegativeIntSideBTest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        Integer data = -RND.randomInteger();
        input.inputLengthToSideB(data.toString());
        clicker.clickOk();
        checker.checkSideBField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода целого отрицательного числа в поле «Сторона Б»";
    }
}

