package triangle.cases.trianglesType.isocelesNotTringle;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class IsoscelesABNotTriangleTest extends BaseForTrianglesType {

    public IsoscelesABNotTriangleTest() {
        super();
    }

    @Test
    public void isoscelesABNotTriangleTest() throws Exception {
        makeIsoscelesNotTriangle('V');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Не треугольник");
    }


    @Override
    public String testInfo() {
        return "Проверка вывода результата «Не треугольник» в случае," +
                " когда длина стороны А больше суммы длин сторон Б и В, являющихся равными";
    }
}

