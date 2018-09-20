package triangle.cases.fieldsData.negative.empty;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class EmptySideATest extends BaseForTests {

    public EmptySideATest() {
        super();
    }

    @Test
    public void testSideATest() throws Exception {
        input.inputLengthToSideB(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());
        clicker.clickOk();
        checker.checkSideAField("Поле не должно быть пустым");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости пустого поля \"Сторона А\"";
    }
}

