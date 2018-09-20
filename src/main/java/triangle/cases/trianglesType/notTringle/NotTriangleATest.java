package triangle.cases.trianglesType.notTringle;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class NotTriangleATest extends BaseForTrianglesType {

    public NotTriangleATest() {
        super();
    }

    @Test

    public void notTriangleATest() throws Exception {
        makeNotTriangle('A');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Не треугольник");
    }

    @Override
    public String testInfo() {
        return " Проверка вывода результата «Не треугольник» в случае, когда длина стороны А больше суммы длин сторон Б и В";
    }
}

