package triangle.cases.trianglesType.scalene;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class ScaleneVTriangleTest extends BaseForTrianglesType {

    public ScaleneVTriangleTest() {
        super();
    }

    @Test
    public void scaleneVTriangleTest() throws Exception {
        makeScaleneTriangle('V');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Разносторонний");
    }

    @Override
    public String testInfo() {
        return "Проверка вывода результата «Разносторонний»";
    }
}

