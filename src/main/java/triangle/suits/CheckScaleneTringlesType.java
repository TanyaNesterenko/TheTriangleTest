package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.cases.trianglesType.scalene.ScaleneATriangleTest;
import triangle.cases.trianglesType.scalene.ScaleneBTriangleTest;
import triangle.cases.trianglesType.scalene.ScaleneVTriangleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ScaleneATriangleTest.class,
        ScaleneBTriangleTest.class,
        ScaleneVTriangleTest.class

})
public class CheckScaleneTringlesType {
}
