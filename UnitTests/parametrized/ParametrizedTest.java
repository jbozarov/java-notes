import org.junit.Test;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParametrizedTest {


    // Regular tests
    @Test
    public void testPrimeNumber() {
        PrimeNumberChecker sut = new PrimeNumberChecker();
        boolean result = sut.validate(13);
        Assertions.assertTrue(result);
    }

    @Test
    public void testPrimeNumberFalse() {
        PrimeNumberChecker sut = new PrimeNumberChecker();
        boolean result = sut.validate(14);
        Assertions.assertFalse(result);
    }
  
    
    // Parametrized test
    @ParameterizedTest
    @ValueSource(ints = {10, 20, 60, 4, 8, 14})
    public void testIsEvenNumber(int number) {
        PrimeNumberChecker sut = new PrimeNumberChecker();
        Assertions.assertTrue(sut.isEvenNumber(number));
    }
  
  
    @ParameterizedTest
    @ValueSource(ints = {11, 21, 61, 41, 81, 9})
    public void testIsEvenNumberFalse(int number) {
        PrimeNumberChecker sut = new PrimeNumberChecker();
        Assertions.assertFalse(sut.isEvenNumber(number));
    }
  
  
}
