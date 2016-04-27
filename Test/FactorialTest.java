import org.junit.Assert;
import org.junit.Test;


public class FactorialTest {
@Test
    public void testFactorial1()

    {
        int expencted = 3;
        int actual = Factorial.bFactorial( 6 );
        Assert.assertEquals(expencted, actual);

        Assert.assertEquals( 2, Factorial.bFactorial( 2 ));
    }
    }
}