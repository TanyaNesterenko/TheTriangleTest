package triangle.cases.trianglesType.notTringle;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class NotTriangleBTest extends BaseForTrianglesType {

    public NotTriangleBTest() {
        super();
    }

    @Test
    public void notTriangleBTest() throws Exception {
        makeNotTriangle('B');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Не треугольник");
    }

    @Override
    public String testInfo(){
        return "Проверка вывода результата «Не треугольник» в случае, когда длина стороны Б больше суммы длин сторон А и В";
    }
}

