package de.ait.javalessons.homework7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MathStringUtilTest {

    private MathStringUtil mathStringUtil;

    @BeforeEach
    public void setUp() {
        mathStringUtil = new MathStringUtil();
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,3,5",
            "-1,4,3",
            "0,0,0",
            "-10,-15,-25"
    })
    void testAdd(int numberOne, int numberTwo, int expected){
        int result = mathStringUtil.add(numberOne, numberTwo);
        assertEquals(expected,result);
    }


    @ParameterizedTest
    @ValueSource (ints = {0,2,4,100,-120})
    void testIsEven(int number) {
        assertTrue(mathStringUtil.isEven(number));
    }

    @ParameterizedTest
    @ValueSource (ints = {11,21,41,101,-121})
    void testIsNotEven(int number) {
        assertFalse(mathStringUtil.isEven(number));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,1",
            "20,5,4",
            "100,25,4",
            "0,0,-100",
            "-10,2,-5"
    })
    void testDivide(int numberOne, int numberTwo, int expected){
        int result = mathStringUtil.divide(numberOne, numberTwo);
        assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvSource({
            "'Iphone',6",
            "'Java',4",
            ", -1",
            "'  A  ',5",
            "'10',2"
    })
    void testGetLength(String strInput, int expected){
        int result = mathStringUtil.getLength(strInput);
        assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvSource({
            "'Iphone', 'ne', true",
            "'Java', 'qq', false",
            ", 'aa', false",
            "'MacBook',,false",
            "'MacBook','', false",
            "'', 'Book', false"
    })
    void testContainsWord(String text, String word, boolean expected){
        boolean result = mathStringUtil.containsWord(text, word);
        assertEquals(expected,result);
    }

}
