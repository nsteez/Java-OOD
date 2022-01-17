package automator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class SupporterTest {
  Supporter supporter1;
  Supporter supporter2;
  Map<String, String> map1;
  Map<String, String> map2;

  @Before
  public void setUp() throws Exception {
    map1 = new HashMap<>();
    map1.put("first_name", "Annalise");
    map1.put("last_name","Keating");
    map1.put("company_name", "LawFirm");
    map1.put("address","1234 Blue Street");
    map1.put("city","New York");
    map1.put("county","New York City");
    map1.put("state","New York");
    map1.put("zip","10003");
    map1.put("phone1","1234567998");
    map1.put("phone2","1234567899");
    map1.put("email","Keating@email.com");
    supporter1 = new Supporter(map1);

    map2 = new HashMap<>();
    map2.put("first_name","Homer");
    map2.put("last_name","Simpson");
    map2.put("company_name","PowerPlant");
    map2.put("address","742 Evergreen Terrace");
    map2.put("city","Springfield");
    map2.put("county","Springfield Place");
    map2.put("state","Oregon");
    map2.put("zip","34567");
    map2.put("phone1","9395550113");
    map2.put("phone2","9395550114");
    map2.put("email","HSimpson@email.com");
    supporter2 = new Supporter(map2);
  }

  @Test
  public void getValue() {
    assertEquals(supporter1.getValue("last_name"), "Keating");
  }

  @Test
  public void testEquals() {
    assertFalse(supporter1.equals(map1));
    assertTrue(supporter1.equals(supporter1));
    assertFalse(supporter1.equals(null));
    assertFalse(supporter1.equals(supporter2));
  }

  @Test
  public void testHashCode() {
    assertFalse(supporter1.hashCode() == supporter2.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Supporter{profile={zip=34567, address=742 Evergreen Terrace, "
            + "city=Springfield, company_name=PowerPlant, county=Springfield Place, "
            + "phone2=9395550114, last_name=Simpson, state=Oregon, first_name=Homer, "
            + "email=HSimpson@email.com, phone1=9395550113}}",
        supporter2.toString());
  }
}