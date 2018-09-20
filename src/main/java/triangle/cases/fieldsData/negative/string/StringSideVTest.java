package triangle.cases.fieldsData.negative.string;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class StringSideVTest extends BaseForTests {

    public StringSideVTest() {
        super();
    }

    @Test
    public void testSideVTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());

        String data = RND.randomString();
        input.inputLengthToSideV(data);
        clicker.clickOk();
        checker.checkSideVField("\'"+ data + "\'не является допустимым числом");
    }

    @Override
    public String testInfo(){
        return " Проверка недопустимости ввода букв в поле «Сторона В»";
    }
}

