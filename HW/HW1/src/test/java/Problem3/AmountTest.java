package Problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {
    private Amount testAmount;


    @Before
    public void setUp() {
        testAmount = new Amount(-10, 100);
    }

    @Test
    public void getDollar() {
        assertEquals(0, testAmount.getDollar());
    }

    @Test
    public void getCent() {
        assertEquals(0, testAmount.getCent());
    }
}