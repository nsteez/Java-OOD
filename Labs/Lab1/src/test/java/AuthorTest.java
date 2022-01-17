import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getName() {
        Person john = new Person("AnnaMae", "Keating");
        assertEquals("AnnaMae Keating", john.getFullName());
        //assertEquals("Keating", elvis.firstName);
    }


//    @Test
//    public void getName() throws Exception {
//        TestCase.fail("Not yet implemented");
//    }
//
//    @Test
//    public void getEmail() throws Exception {
//        TestCase.fail("Not yet implemented");
//    }
//
//    @Test
//    public void getAddress() throws Exception {
//        TestCase.fail("Not yet implemented");
//    }
}