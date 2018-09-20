package triangle.cases.trianglesType.rectangular;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class RectangularBTriangleTest extends BaseForTrianglesType {

    public RectangularBTriangleTest() {
        super();
    }

    @Test
    public void rectangularBTriangleTest() throws Exception {
        makeRectangularTriangle('B');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Прямоугольный");
    }

    @Override
    public String testInfo(){
        return "Проверка вывода результата «Прямоугольный» в случае, сторона Б гипотенуза";
    }
}

