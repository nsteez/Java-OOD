package propertysearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SaleTest {
  private Sale test;

  @Before
  public void setUp() throws Exception {
    test = new Sale(1200000.0, true);
  }

  @Test
  public void testToString() {
    String expected = "Sale{} AbstractContract{askingPrice=1200000.0, negotiable=true}";
    assertEquals(expected, test.toString());
  }
}