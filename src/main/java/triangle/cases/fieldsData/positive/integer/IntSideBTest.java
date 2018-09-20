package triangle.cases.fieldsData.positive.integer;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class IntSideBTest extends BaseForTests {

    public IntSideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());
        clicker.clickOk();
        checker.checkSideBField("");
    }

    @Override
    public String testInfo(){
        return "Проверка допустимости ввода целого положительного числа в поле «Сторона Б»";
    }
}

