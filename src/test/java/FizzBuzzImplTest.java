import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzImplTest {

    final FizzBuzzImpl changeNumber = new FizzBuzzImpl();


    @Test
    void numberInRange() {
        assertEquals(true,changeNumber.numberInRange(3));
        assertEquals(true,changeNumber.numberInRange(35));
        assertEquals(false,changeNumber.numberInRange(-3));
        assertEquals(false,changeNumber.numberInRange(300));
    }


    @Test
    void numberToFizzBuzz() {
        assertEquals("1",changeNumber.numberToFizzBuzz(1));
        assertEquals("2",changeNumber.numberToFizzBuzz(2));
        assertEquals("Fizz",changeNumber.numberToFizzBuzz(3));
        assertEquals("Fizz",changeNumber.numberToFizzBuzz(6));
        assertEquals("Buzz",changeNumber.numberToFizzBuzz(5));
        assertEquals("Buzz",changeNumber.numberToFizzBuzz(10));
        assertEquals("FizzBuzz",changeNumber.numberToFizzBuzz(15));
        assertEquals("FizzBuzz",changeNumber.numberToFizzBuzz(30));
    }


    @Test
    void checkRange() {
        assertEquals(true, changeNumber.checkRange(0,100));
        assertEquals(true, changeNumber.checkRange(1,99));
        assertEquals(false, changeNumber.checkRange(100,0));
        assertEquals(false, changeNumber.checkRange(-1,100));
        assertEquals(false, changeNumber.checkRange(0,101));
        assertEquals(false, changeNumber.checkRange(-1,101));
        assertEquals(false, changeNumber.checkRange(1,101));
        assertEquals(false, changeNumber.checkRange(-1,99));
    }

    @Test
    void printStreamToString() {
        String test = "Buzz-11-Fizz-13-14-FizzBuzz";
        assertEquals(test,changeNumber.printStreamToString(10,15,'-'));
        assertNotEquals(test,changeNumber.printStreamToString(10,15,'+'));
        assertEquals("Illegal arguments",changeNumber.printStreamToString(20,15,'-'));
    }
}