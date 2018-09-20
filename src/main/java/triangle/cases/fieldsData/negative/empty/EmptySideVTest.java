package triangle.cases.fieldsData.negative.empty;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class EmptySideVTest extends BaseForTests {

    public EmptySideVTest() {
        super();
    }

    @Test
    public void testSideVTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());
        clicker.clickOk();
        checker.checkSideVField("Поле не должно быть пустым");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости пустого поля \"Сторона В\"";
    }
}

