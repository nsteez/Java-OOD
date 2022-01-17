package automator;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class CSVReaderTest {
  CSVReader csv1, csv2, csv3;
  Map<String, String> map1;
  Map<String, String> map2;
  Supporter supporter1;
  Supporter supporter2;



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


    csv1 = new CSVReader("TestData/short.csv");
    csv2 = new CSVReader("TestData/short.csv");
    csv3 = new CSVReader("TestData/short2.csv");
  }

  @Test(expected = IOException.class)
  public void readFile() throws IOException{
    csv1 = new CSVReader("TestData/WRONG.csv");
  }


  @Test
  public void getSupporter() {
    assertEquals("James", csv1.getSupporter().getValue("first_name"));
    assertEquals("Josephine", csv1.getSupporter().getValue("first_name"));
    assertEquals("Art", csv1.getSupporter().getValue("first_name"));
    assertEquals("Lenna", csv1.getSupporter().getValue("first_name"));
    assertNull(csv1.getSupporter());

  }

  @Test
  public void testEquals(){
    assertTrue(csv1.equals(csv1));
    assertFalse(csv1.equals(csv3));
    assertFalse(csv1.equals(null));
  }

  @Test
  public void testHashCode(){
    assertTrue(csv1.hashCode() == csv2.hashCode());

  }

  @Test
  public void testToString(){
    assertEquals(csv2.toString(), csv1.toString());

  }
}