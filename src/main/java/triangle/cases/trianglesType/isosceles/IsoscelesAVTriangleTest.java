package triangle.cases.trianglesType.isosceles;

import org.junit.Test;
import triangle.cases.trianglesType.BaseForTrianglesType;

public class IsoscelesAVTriangleTest extends BaseForTrianglesType {

    public IsoscelesAVTriangleTest() {
        super();
    }

    @Test
    public void isoscelesABTriangleTest() throws Exception {
        makeIsoscelesTriangle('B');
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
                " если сторона А равна стороне В и  сумма длины стороны А и стороны В меньше длины стороны Б.";
    }

}

