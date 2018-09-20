package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.cases.trianglesType.isosceles.IsoscelesABTriangleTest;
import triangle.cases.trianglesType.isosceles.IsoscelesAVTriangleTest;
import triangle.cases.trianglesType.isosceles.IsoscelesBVTriangleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        IsoscelesABTriangleTest.class,
        IsoscelesAVTriangleTest.class,
        IsoscelesBVTriangleTest.class,
})
public class CheckIsoscelesTringlesType {
}
