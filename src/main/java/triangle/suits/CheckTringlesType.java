package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import triangle.cases.trianglesType.equilateral.*;
import triangle.cases.trianglesType.isocelesNotTringle.*;
import triangle.cases.trianglesType.isosceles.*;
import triangle.cases.trianglesType.notTringle.*;
import triangle.cases.trianglesType.rectangular.*;
import triangle.cases.trianglesType.scalene.*;

/**
 * Тест-сет
 * Прогон тестов на проверку вывода результата по введенным длинам сторон
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        EquilTriangleTest.class,
        IsoscelesABNotTriangleTest.class,
        IsoscelesAVNotTriangleTest.class,
        IsoscelesBVNotTriangleTest.class,
        IsoscelesABTriangleTest.class,
        IsoscelesAVTriangleTest.class,
        IsoscelesBVTriangleTest.class,
        NotTriangleATest.class,
        NotTriangleBTest.class,
        NotTriangleVTest.class,
        RectangularATriangleTest.class,
        RectangularBTriangleTest.class,
        RectangularVTriangleTest.class,
        ScaleneATriangleTest.class,
        ScaleneBTriangleTest.class,
        ScaleneVTriangleTest.class

})
public class CheckTringlesType {
}

