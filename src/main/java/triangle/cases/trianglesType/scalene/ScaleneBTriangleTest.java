package triangle.cases.trianglesType.scalene;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class ScaleneBTriangleTest extends BaseForTrianglesType {

    public ScaleneBTriangleTest() {
        super();
    }

    @Test
    public void scaleneBTriangleTest() throws Exception {
        makeScaleneTriangle('B');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Разносторонний");
    }

    @Override
    public String testInfo() {
        return " Проверка вывода результата «Разносторонний»";
    }
}

