package triangle.cases.fieldsData.negative.string;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class StringSideATest extends BaseForTests {

    public StringSideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        String data = RND.randomString();
        input.inputLengthToSideA(data);
        clicker.clickOk();
        checker.checkSideAField("\'" + data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo() {
        return " Проверка недопустимости ввода букв в поле «Сторона А»";
    }
}

