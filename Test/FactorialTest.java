import org.junit.Assert;
import org.junit.Test;


public class FactorialTest {
@Test
    public void testFactorial1() {
    Assert.assertEquals(2, Factorial.factorialFactorial(2));
}
    @Test
    public void testFactorial2() {
        Assert.assertEquals( 4, Factorial.factorialFactorial( 24 ));
    }
    @Test
    public void testFactorial3() {
        Assert.assertEquals( 3, Factorial.factorialFactorial( 6 ));
    }
    }
