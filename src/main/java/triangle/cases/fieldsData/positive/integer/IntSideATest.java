package triangle.cases.fieldsData.positive.integer;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class IntSideATest extends BaseForTests {

    public IntSideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());
        input.inputLengthToSideA(RND.randomInteger().toString());
        clicker.clickOk();
        checker.checkSideAField("");
    }

    @Override
    public String testInfo(){
        return "Проверка допустимости ввода целого положительного числа в поле «Сторона А»";
    }
}

