package triangle.cases.trianglesType.isocelesNotTringle;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class IsoscelesBVNotTriangleTest extends BaseForTrianglesType {

    public IsoscelesBVNotTriangleTest() {
        super();
    }

    @Test
    public void isoscelesBVNotTriangleTest() throws Exception {
        makeIsoscelesNotTriangle('A');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Не треугольник");
    }

    @Override
    public String testInfo(){
        return "Проверка вывода результата «Не треугольник» в случае," +
                " когда длина стороны В больше суммы длин сторон А и Б, являющихся равными";
    }
}

