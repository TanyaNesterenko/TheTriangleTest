package triangle.cases.fieldsData.positive.floats;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class FloatSideBTest extends BaseForTests {

    public FloatSideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomFloat().toString());
        input.inputLengthToSideV(RND.randomFloat().toString());
        input.inputLengthToSideB(RND.randomFloat().toString());
        clicker.clickOk();
        checker.checkSideBField("");
    }
    @Override
    public String testInfo(){
        return "Проверка допустимости ввода дробного положительного числа в поле «Сторона Б»";
    }
}

