import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParametrizedTest {


    // Regular tests
    @Test
    public void testPrimeNumber() {
        PrimeNumberChecker sut = new PrimeNumberChecker();
        boolean result = sut.validate(13);
        assertTrue(result);
    }

    @Test
    public void testPrimeNumberFalse() {
        PrimeNumberChecker sut = new PrimeNumberChecker();
        boolean result = sut.validate(14);
        assertFalse(result);
    }
  
  
  
  
  
}
