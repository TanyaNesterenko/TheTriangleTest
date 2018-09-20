package triangle.cases.fieldsData.negative.negInt;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class NegativeIntSideVTest extends BaseForTests {

    public NegativeIntSideVTest() {
        super();
    }


    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());

        Integer data = -RND.randomInteger();
        input.inputLengthToSideB(data.toString());
        input.inputLengthToSideV(RND.randomInteger().toString());
        clicker.clickOk();
        checker.checkSideVField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости ввода целого отрицательного числа в поле «Сторона В»";
    }

}

