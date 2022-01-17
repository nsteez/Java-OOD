package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    private Time testTime1, testTime2,testTime3,testTime4;

    @Before
    public void setUp() throws Exception {
        testTime1 = new Time(3,2, 12);
        testTime2 = new Time(1, 14, 15);
        testTime3 = new Time(0,0,0);
        testTime4 = new Time(2,1,10);

    }

    @Test
    public void getDifference() {
        Time difference1 = testTime1.getDifference(testTime2);
        Time expected1 = new Time(1,47,57);
        assertEquals(expected1.toString(), difference1.toString());

        Time difference2 = testTime4.getDifference(testTime3);
        Time expected2 = new Time(2,1,10);
        assertEquals(expected2.toString(), difference2.toString());
    }

    @Test
    public void testToString() {
        assertEquals("3 hours 2 minutes 12 seconds",testTime1.toString());
        assertEquals("1 hour 14 minutes 15 seconds",testTime2.toString());
        assertEquals("0 hours 0 minutes 0 seconds", testTime3.toString());
    }
}