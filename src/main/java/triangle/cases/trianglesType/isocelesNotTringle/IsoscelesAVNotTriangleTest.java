package triangle.cases.trianglesType.isocelesNotTringle;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class IsoscelesAVNotTriangleTest extends BaseForTrianglesType {

    public IsoscelesAVNotTriangleTest() {
        super();
    }

    @Test
    public void isoscelesAVNotTriangleTest() throws Exception {
        makeIsoscelesNotTriangle('B');
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
                " когда длина стороны Б больше суммы длин сторон А и В, являющихся равными";
    }
}

