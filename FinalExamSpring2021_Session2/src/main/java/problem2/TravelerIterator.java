package problem2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class TravelerIterator implements Iterator {
  private List<Traveler> traveler;
  private int current;

  public TravelerIterator(List<Traveler> traveler) {
    this.traveler = traveler;
    this.current = -1;
    this.current = getNextTraveler();
}

  private boolean isQualifying(Traveler traveler){
    return traveler.traveledDestinations().size() > 5;
  }

  private int getNextTraveler(){
    int i;

    for(i = current + 1; i < traveler.size(); i++) {
      if (isQualifying(traveler.get(i))) {
        break;
      }
    }

    return i;
  }

  /**
   * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true}
   * if {@link #next} would return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return current != traveler.size();
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   */
  @Override
  public Traveler next() {
    Traveler traveler = this.traveler.get(current);
    current = getNextTraveler();
    return traveler;
  }
}


