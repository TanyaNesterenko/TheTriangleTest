package triangle.cases.fieldsData.positive.integer;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class IntSideVTest extends BaseForTests {

    public IntSideVTest() {
        super();
    }

    @Test
    public void testSideVTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());
        clicker.clickOk();
        checker.checkSideVField("");
    }

    @Override
    public String testInfo(){
        return "Проверка допустимости ввода целого положительного числа в поле «Сторона В»";
    }
}

