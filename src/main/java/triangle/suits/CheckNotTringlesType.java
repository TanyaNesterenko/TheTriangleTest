package triangle.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.cases.trianglesType.notTringle.NotTriangleATest;
import triangle.cases.trianglesType.notTringle.NotTriangleBTest;
import triangle.cases.trianglesType.notTringle.NotTriangleVTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        NotTriangleATest.class,
        NotTriangleBTest.class,
        NotTriangleVTest.class,
})
public class CheckNotTringlesType {
}
