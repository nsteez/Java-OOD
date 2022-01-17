package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SwimmerTest {
  Swimmer test1;
  Swimmer test2;
  Swimmer test3;

  @Before
  public void setUp() throws Exception {
    String name = "Jane Jones";
    List <Double> butterfly50mTimes1 = new ArrayList<>();
    butterfly50mTimes1.add(35.0);
    butterfly50mTimes1.add(40.0);
    butterfly50mTimes1.add(41.0);
    butterfly50mTimes1.add(39.0);
    butterfly50mTimes1.add(36.0);

    List <Double> backstroke50mTimes1 = new ArrayList<>();
    backstroke50mTimes1.add(35.4);
    backstroke50mTimes1.add(34.1);

    List<Double> breaststroke50mTimes1 = new ArrayList<>();
    breaststroke50mTimes1.add(45.2);

    List <Double> freestyle50mTimes1 = new ArrayList<>();
    freestyle50mTimes1.add(40.0);
    freestyle50mTimes1.add(39.0);
    freestyle50mTimes1.add(38.0);
    freestyle50mTimes1.add(37.0);

    List <Double> freestyle50mTimes2 = new ArrayList<>();
    freestyle50mTimes2.add(38.0);
    freestyle50mTimes2.add(33.0);
    freestyle50mTimes2.add(32.0);
    freestyle50mTimes2.add(31.0);

    test1 = new Swimmer(name,butterfly50mTimes1, backstroke50mTimes1,
                             breaststroke50mTimes1,freestyle50mTimes1);
    test2 = new Swimmer(name,butterfly50mTimes1,backstroke50mTimes1,
                             breaststroke50mTimes1,freestyle50mTimes2);
    test3 = new Swimmer(name,butterfly50mTimes1,backstroke50mTimes1,
                             breaststroke50mTimes1,freestyle50mTimes1);

  }

  @Test
  public void getName() {
    assertEquals("Jane Jones", test1.getName());
  }

  @Test
  public void getButterfly50mTimes() {

  }

  @Test
  public void getBackstroke50mTimes() {
  }

  @Test
  public void getBreaststroke50mTimes() {
  }

  @Test
  public void getFreestyle50mTimes() {

    assertEquals(test1.getFreestyle50mTimes(), test3.getFreestyle50mTimes());
    System.out.println(test1.toString());
  }

  @Test
  public void getAverageTime() {

    assertEquals(38, test1.getAverageTime(test1.getFreestyle50mTimes()));

  }

  @Test
  public void compareTo() {
    assertFalse(test2.getAverageTime(test2.getFreestyle50mTimes()) == (test3.getAverageTime(test3.getFreestyle50mTimes())));
  }
}