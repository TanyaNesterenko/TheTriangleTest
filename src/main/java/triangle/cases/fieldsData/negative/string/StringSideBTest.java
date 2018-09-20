package triangle.cases.fieldsData.negative.string;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class StringSideBTest extends BaseForTests {

    public StringSideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        String data = RND.randomString();
        input.inputLengthToSideB(data);
        clicker.clickOk();
        checker.checkSideBField("\'"+ data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo(){
        return "Проверка недопустимости ввода букв в поле «Сторона Б»";
    }
}

