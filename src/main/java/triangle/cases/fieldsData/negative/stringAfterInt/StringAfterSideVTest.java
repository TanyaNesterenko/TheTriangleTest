package triangle.cases.fieldsData.negative.stringAfterInt;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class StringAfterSideVTest extends BaseForTests {

    public StringAfterSideVTest() {
        super();
    }

    @Test
    public void testSideVTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideB(RND.randomInteger().toString());

        for (int i = 1; i <9 ; i++) {
            String data = RND.randomStringAfterNum(i);
            input.inputLengthToSideV(data);
            clicker.clickOk();
            Thread.sleep(100);
            checker.checkSideVField("\'"+ data + "\'не является допустимым числом");
        }
    }

    @Override
    public String testInfo(){
        return "Проверка недопустимости ввода букв после числа  в поле «Сторона В»";
    }
}

