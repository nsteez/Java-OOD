package problem1;

import java.util.Iterator;
import java.util.List;

public class TravelerIterator implements Iterator<Traveler> {

  private List<Traveler> travelers;
  private int currentIndex;

  public TravelerIterator(List<Traveler> travelers) {
    this.travelers = travelers;
    this.currentIndex = 0;
  }


  /**
   * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true}
   * if {@link #next} would return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    if (this.currentIndex >= this.travelers.size())
      return false;

    return true;
  }



  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public Traveler next() {
    return null;
  }
}

