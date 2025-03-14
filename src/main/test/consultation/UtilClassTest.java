package consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilClassTest {

    private UtilClass utilClass;

    @BeforeEach
    void setUp() {
        utilClass = new UtilClass();
    }

    @Test
    void reverseStringTest(){
        assertNotNull(utilClass.reverseString("notebook"));
        assertEquals("koobeton", utilClass.reverseString("notebook"));
    }

    @Test
    void testIsEvenReturnTrue(){
        assertTrue(utilClass.isEven(10));
    }

    @Test
    void testIsEvenReturnFalse(){
        assertFalse(utilClass.isEven(5));
    }

    @Test
    void testIsEvenReturnTrueParamaeter0(){
        assertTrue(utilClass.isEven(0));
    }

    @Test
    void testfindMaxOnlyPostiveNumbers(){
        int [] testArray = {1,5,3,6,8,5};
        assertEquals(8, utilClass.findMax(testArray));
    }

    @Test
    void testfindMaxOnlyPostiveNumbersNegativeResult(){
        int [] testArray = {1,5,3,6,8,5};
        assertNotEquals(6, utilClass.findMax(testArray));
    }

    @Test
    void testfindMaxOnlyNegativeNumbers(){
        int [] testArray = {-1,-5,-3,-6,-8,-5};
        assertEquals(-1, utilClass.findMax(testArray));
    }

}
