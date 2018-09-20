package triangle.cases.trianglesType.scalene;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class ScaleneATriangleTest extends BaseForTrianglesType {

    public ScaleneATriangleTest() {
        super();
    }

    @Test
    public void scaleneTriangleTest() throws Exception {
        makeScaleneTriangle('A');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Разносторонний");
    }

    @Override
    public String testInfo(){
        return "Проверка вывода результата «Разносторонний»";
    }
}

