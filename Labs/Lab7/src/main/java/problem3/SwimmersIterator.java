package problem3;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import problem2.Swimmer;

public class SwimmersIterator implements Iterator {

  private List<Swimmer> swimmers;
  private int current;


  public SwimmersIterator(List<Swimmer> Swimmers) {
    this.swimmers = Swimmers;
    this.current = -1;
    this.current = getNextSwimmer();
  }

  private boolean isQualifying(Swimmer swimmer){
    Double qualifyingTime = 26.17;

    if(swimmer.getButterfly50mTimes().size() >= 5 ) {
      for(double freestyle: swimmer.getFreestyle50mTimes()){
        if(freestyle <= qualifyingTime){
          return true;
        }
      }
    }
    return false;
  }

  private int getNextSwimmer(){
    int i;

    for(i = current+1; i < swimmers.size(); i++) {
      if (isQualifying(swimmers.get(i))) {
        break;
      }
    }

    return i;
  }

  //List<Double> butterflyTimes = new ArrayList<Double>();
//      List<Double> freestyleTimes = new ArrayList<Double>();
//      Double qualifyingTime = 26.17;
//      String[] swimmersNames;
//      int count = 0;
//      for (swimmers:butterfly50mTimes) {
//        if (butterflyTimes.size() >= 5) {
//          swimmersNames.add();
//        }
//      return null;

  /**
   * Returns {@code true} if the iteration has more elements. (In other words, returns {@code true}
   * if {@link #next} would return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return current != swimmers.size();
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public Swimmer next() {
    Swimmer swimmer = this.swimmers.get(current);
    current = getNextSwimmer();
    return swimmer;
  }
}
//  /**
//   * Iterates over the given list of swimmers, and returns those swimmers who have at lease five butterfly
//   * swim times, and who have achieved at least one 50m Olympic freestyle qualifying time. The
//   * current 50m freestyle Olympic qualifying time is 26.17s
//   */
// // public String[] swimmers(List<Double> butterfly50mTimes,List<Double> freestyle50mTimes) {
//
//
//   // }
//

