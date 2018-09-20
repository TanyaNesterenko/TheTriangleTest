package triangle.cases.trianglesType.isosceles;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class IsoscelesBVTriangleTest extends BaseForTrianglesType {

    public IsoscelesBVTriangleTest() {
        super();
    }

    @Test
    public void isoscelesABTriangleTest() throws Exception {
        makeIsoscelesTriangle('A');
        input.inputLengthToSideA(getSideA());
        input.inputLengthToSideB(getSideB());
        input.inputLengthToSideV(getSideV());
        clicker.clickOk();
        Thread.sleep(1000);
        checker.checkResult("Равнобедренный");
    }

    @Override
    public String testInfo(){
        return "Проверка вывода результата «Равнобедренный» в случае," +
                " если сторона Б равна стороне В и  сумма длины стороны Б и стороны В меньше длины стороны А.";
    }

}

