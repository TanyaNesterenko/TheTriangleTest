package triangle.cases.fieldsData.positive.floats;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class FloatSideATest extends BaseForTests {

    public FloatSideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomFloat().toString());
        input.inputLengthToSideV(RND.randomFloat().toString());
        input.inputLengthToSideA(RND.randomFloat().toString());
        clicker.clickOk();
        checker.checkSideAField("");
    }

    @Override
    public String testInfo(){
        return "Проверка допустимости ввода дробного положительного числа в поле «Сторона А»";
    }
}

