package triangle.cases.trianglesType.equilateral;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class EquilTriangleTest extends BaseForTrianglesType {

    public EquilTriangleTest() {
        super();
    }

    @Test
    public void equipTriangleTest() throws Exception {
        makeEquilateralTriangle();
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Равносторонний");
    }

    @Override
    public String testInfo() {
        return "Проверка вывода результата «Равносторонний» в случае, если все три стороны равны";
    }
}

