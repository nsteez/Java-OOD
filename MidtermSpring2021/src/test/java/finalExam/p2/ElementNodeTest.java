package finalExam.p2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import jdk.vm.ci.meta.Local;
import org.junit.Before;
import org.junit.Test;

public class ElementNodeTest {
  private ITaxReturnSystem taxSystem;
  private TaxReturn taxReturn1;
  private TaxReturn taxReturn2;


  @Before
  public void setUp() throws Exception {
    taxReturn1 = new TaxReturn(
        new Name("ana", "", "harvey"),
        new Name("Nate", "", "Harvey"),
        new ContactInfo(
            "6453 JK st",
            "Seattle",
            "WA",
            "98055",
            "5521534531",
            "analise@email.com"), "34333",
        (Integer) 2019, LocalDate.of(2019, 3, 15),
        3500.0d, 600.0);

    taxReturn2 = new TaxReturn(
        new Name("aba", "", "harvey"),
        new Name("Nbte", "", "Harvey"),
        new ContactInfo(
            "6353 JK st",
            "Seattle",
            "WA",
            "98055",
            "5521534531",
            "anblise@email.com"), "32333",
        (Integer) 2019, LocalDate.of(2019, 3, 15),
        3100.0d, 200.0);

    taxSystem = new EmptyNode();
  }

  @Test
  public void isEmpty() throws DuplicateException{
    assertTrue(taxSystem.isEmpty());
    taxSystem = taxSystem.add(taxReturn1);
    assertFalse(taxSystem.isEmpty());
  }

  @Test
  public void count() throws DuplicateException{
    assertEquals(taxSystem.count(), (Integer) 0);
    taxSystem = taxSystem.add(taxReturn1);
    assertEquals((Integer) 1, taxSystem.count());
  }

  @Test
  public void remove() throws DuplicateException, TaxReturnNotFoundException {
    taxSystem = taxSystem.add(taxReturn1);
    taxSystem = taxSystem.remove(taxReturn1);
    assertEquals((Integer) 0, taxSystem.count());
  }

  @Test
  public void contains() throws DuplicateException {
    taxSystem = taxSystem.add(taxReturn1);
    assertTrue(taxSystem.contains(taxReturn1));
  }

  @Test
  public void checkDate() throws DuplicateException, TaxReturnNotFoundException{
    taxSystem = taxSystem.add(taxReturn1);
    assertTrue(taxSystem.checkDate(taxReturn1, LocalDate.of(2019, 3, 15)));
  }

  @Test
  public void processed() throws DuplicateException, TaxReturnNotFoundException{
    taxSystem = taxSystem.add(taxReturn1);
    assertFalse(taxSystem.Processed(taxReturn1));
  }

  @Test
  public void checkOverpaid() throws DuplicateException{
    taxSystem = taxSystem.add(taxReturn1);
    taxSystem = taxSystem.add(taxReturn2);


  }

  @Test
  public void checkTIN() {
  }
}