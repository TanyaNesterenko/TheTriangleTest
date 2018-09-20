package triangle.cases.fieldsData.negative.empty;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class EmptySideBTest extends BaseForTests {

    public EmptySideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());
        clicker.clickOk();
        checker.checkSideBField("Поле не должно быть пустым");
    }

    @Override
    public String testInfo() {
        return "Проверка недопустимости пустого поля \"Сторона Б\"";
    }
}

