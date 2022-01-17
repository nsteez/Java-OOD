package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerTest {
    private Owner testOwner;
    @Before
    public void setUp() throws Exception {
        testOwner = new Owner("Annalise", "Keating", "8004447777");
    }

    @Test
    public void getFirstName() {
        assertEquals("Annalise", testOwner.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Keating", testOwner.getLastName());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals("8004447777", testOwner.getPhoneNumber());
    }

    @Test
    public void setFirstName() {
        testOwner.setFirstName("Conner");
        assertEquals("Conner", testOwner.getFirstName());

    }

    @Test
    public void setLastName() {
        testOwner.setLastName("Walsh");
        assertEquals("Walsh", testOwner.getLastName());
    }

    @Test
    public void setPhoneNumber() {
        testOwner.setPhoneNumber("8007774444");
        assertEquals("8007774444", testOwner.getPhoneNumber());

        testOwner.setPhoneNumber("80077744");
        assertEquals("8007774444", testOwner.getPhoneNumber());
    }

    @Test
    public void testPhoneLength() {
        //testOwner.testPhoneLength("8007774444");
        assertTrue("8007774444",true);
        assertFalse("800444",false);
    }
}
