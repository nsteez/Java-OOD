package problem3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import problem2.Swimmer;

public class SwimmerListTest {
  SwimmerList swimmers = new SwimmerList();

  @Before
  public void setUp() throws Exception {
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
    freestyle50mTimes2.add(12.0);
    freestyle50mTimes2.add(31.0);

    swimmers.add(new Swimmer("Jane",butterfly50mTimes1, backstroke50mTimes1,
        breaststroke50mTimes1,freestyle50mTimes1));
    swimmers.add(new Swimmer("ana",butterfly50mTimes1,backstroke50mTimes1,
        breaststroke50mTimes1,freestyle50mTimes2));
    swimmers.add(new Swimmer("charles",butterfly50mTimes1,backstroke50mTimes1,
        breaststroke50mTimes1,freestyle50mTimes1));
    swimmers.add(new Swimmer("dave",butterfly50mTimes1,backstroke50mTimes1,
        breaststroke50mTimes1,freestyle50mTimes1));
    swimmers.add(new Swimmer("greta thunberg",butterfly50mTimes1,backstroke50mTimes1,
        breaststroke50mTimes1,freestyle50mTimes2));
    swimmers.add(new Swimmer("Jay Z",butterfly50mTimes1,backstroke50mTimes1,
        breaststroke50mTimes1,freestyle50mTimes1));
    swimmers.add(new Swimmer("Snoop dogg",butterfly50mTimes1,backstroke50mTimes1,
        breaststroke50mTimes1,freestyle50mTimes2));
  }

  @Test
  public void iterator() {
    for (Swimmer swimmer : swimmers)
    {
      System.out.println(swimmer.getName());
    }

    SwimmersIterator it = new SwimmersIterator(swimmers);
    System.out.println(it.next().getName());
  }
}