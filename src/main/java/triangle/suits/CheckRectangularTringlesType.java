package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.cases.trianglesType.rectangular.RectangularATriangleTest;
import triangle.cases.trianglesType.rectangular.RectangularBTriangleTest;
import triangle.cases.trianglesType.rectangular.RectangularVTriangleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RectangularATriangleTest.class,
        RectangularBTriangleTest.class,
        RectangularVTriangleTest.class,
})
public class CheckRectangularTringlesType {
}
