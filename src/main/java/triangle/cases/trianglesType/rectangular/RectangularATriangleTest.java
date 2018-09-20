package triangle.cases.trianglesType.rectangular;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class RectangularATriangleTest extends BaseForTrianglesType {

    public RectangularATriangleTest() {
        super();
    }

    @Test
    public void rectangularATriangleTest() throws Exception {
        makeRectangularTriangle('A');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Прямоугольный");
    }

    @Override
    public String testInfo(){
        return "Проверка вывода результата «Прямоугольный» в случае, сторона А гипотенуза";
    }
}

