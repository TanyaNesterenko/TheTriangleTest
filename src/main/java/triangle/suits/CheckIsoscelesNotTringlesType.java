package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.cases.trianglesType.isocelesNotTringle.IsoscelesABNotTriangleTest;
import triangle.cases.trianglesType.isocelesNotTringle.IsoscelesAVNotTriangleTest;
import triangle.cases.trianglesType.isocelesNotTringle.IsoscelesBVNotTriangleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        IsoscelesABNotTriangleTest.class,
        IsoscelesAVNotTriangleTest.class,
        IsoscelesBVNotTriangleTest.class,
})
public class CheckIsoscelesNotTringlesType {
}
