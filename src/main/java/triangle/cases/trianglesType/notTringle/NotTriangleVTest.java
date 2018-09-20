package triangle.cases.trianglesType.notTringle;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class NotTriangleVTest extends BaseForTrianglesType {

    public NotTriangleVTest() {
        super();
    }

    @Test
    public void notTriangleVTest() throws Exception {
        makeNotTriangle('V');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Не треугольник");
    }

    @Override
    public String testInfo() {
        return "Проверка вывода результата «Не треугольник» в случае, когда длина стороны В больше суммы длин сторон А и Б";
    }
}

