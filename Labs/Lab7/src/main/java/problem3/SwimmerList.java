package problem3;

import java.util.ArrayList;
import java.util.Iterator;
import problem2.Swimmer;

public class SwimmerList extends ArrayList<Swimmer> implements Iterable<Swimmer> {
  @Override
  public Iterator<Swimmer> iterator() {
    return super.iterator();
  }
}
