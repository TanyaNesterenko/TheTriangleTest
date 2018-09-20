package triangle.cases.trianglesType.rectangular;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class RectangularVTriangleTest extends BaseForTrianglesType {

    public RectangularVTriangleTest() {
        super();
    }

    @Test
    public void rectangularVTriangleTest() throws Exception {
        makeRectangularTriangle('V');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Прямоугольный");
    }

    @Override
    public String testInfo() {
        return "Проверка вывода результата «Прямоугольный» в случае, сторона В гипотенуза";
    }
}

