package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripTest {
    private Trip testTrip1;
    private Time startTime1, endTime1;
    @Before
    public void setUp() throws Exception {
        endTime1 = new Time(3,2,12);
        startTime1 = new Time(1, 14 ,15);
        testTrip1 = new Trip("Kirkland", "Bellevue",startTime1, endTime1 );

    }

    @Test
    public void getStartTime() {
        assertEquals(startTime1.toString(), testTrip1.getStartTime().toString());

    }

    @Test
    public void getEndTime() {
        assertEquals(endTime1.toString(), testTrip1.getEndTime().toString());
    }

    @Test
    public void getStartingLocation() {
        assertEquals("Kirkland", testTrip1.getStartingLocation());
    }

    @Test
    public void getEndingLocation() {
        assertEquals("Bellevue", testTrip1.getEndingLocation());

    }

    @Test
    public void setStartingLocation() {
        testTrip1.setStartingLocation("Renton");
        assertEquals("Renton", testTrip1.getStartingLocation());
    }

    @Test
    public void setEndingLocation() {
        testTrip1.setEndingLocation("Kirkland");
        assertEquals("Kirkland", testTrip1.getEndingLocation());
    }

    @Test
    public void setStartTime() {
        Time timeTester1 = new Time(1,1,1);
        testTrip1.setStartTime(timeTester1);
        assertEquals(timeTester1, testTrip1.getStartTime());
    }

    @Test
    public void setEndTime() {
        Time timeTester2 = new Time(3,3,3);
        testTrip1.setEndTime(timeTester2);
        assertEquals(timeTester2, testTrip1.getEndTime());
    }

    @Test
    public void getDuration() {
        Time duration = testTrip1.getDuration();
        Time expected = new Time(1,47,57);
        assertEquals(expected.toString(), duration.toString());

    }
}