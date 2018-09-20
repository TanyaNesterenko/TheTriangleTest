package triangle.cases.fieldsData.negative.stringAfterInt;

import org.junit.Test;
import triangle.utils.BaseForTests;
import triangle.utils.RND;

public class StringAfterSideBTest extends BaseForTests {

    public StringAfterSideBTest() {
        super();
    }

    @Test
    public void testSideBTest() throws Exception {
        input.inputLengthToSideA(RND.randomInteger().toString());
        input.inputLengthToSideV(RND.randomInteger().toString());

        for (int i = 1; i <9 ; i++) {
            String data = RND.randomStringAfterNum(i);
            input.inputLengthToSideB(data);
            clicker.clickOk();
            Thread.sleep(100);
            checker.checkSideBField("\'"+ data + "\'не является допустимым числом");
        }
    }

    @Override
    public String testInfo(){
        return "Проверка недопустимости ввода букв после числа  в поле «Сторона Б»";
    }
}

