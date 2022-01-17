package problem2;

import java.util.ArrayList;
import java.util.List;
import problem3.SwimmersIterator;

/**
 * Class Swimmer contains information about a swimmer, and the list of their swimming times, when
 * swimming 50m. Four swimming styles are considered: butterfly, backstroke, breaststroke, and freestyle.
 */
public class Swimmer implements  Comparable<Swimmer> {

  private String name;
  private List<Double> butterfly50mTimes;
  private List<Double> backstroke50mTimes;
  private List<Double> breaststroke50mTimes;
  private List<Double> freestyle50mTimes;

  public Swimmer(String name, List<Double> butterfly50mTimes,List<Double> backstroke50mTimes,
      List<Double> breaststroke50mTimes,List<Double> freestyle50mTimes) {
    this.name = name;
    this.butterfly50mTimes = butterfly50mTimes;
    this.backstroke50mTimes = backstroke50mTimes;
    this.breaststroke50mTimes = breaststroke50mTimes;
    this.freestyle50mTimes = freestyle50mTimes;
  }

  public String getName() {
    return name;
  }

  public List<Double> getButterfly50mTimes() {
    return butterfly50mTimes;
  }

  public List<Double> getBackstroke50mTimes() {
    return backstroke50mTimes;
  }

  public List<Double> getBreaststroke50mTimes() {
    return breaststroke50mTimes;
  }

  public List<Double> getFreestyle50mTimes() {
    return freestyle50mTimes;
  }


  public int getAverageTime(List<Double> x){
    int total = 0;
    int count = 0;
    //List<Double> times = new ArrayList<Double>();
    for (int i = 0; i < x.size(); i++) {
      count +=1;
      total+= x.get(i);
    }
    return (int) total / count;

  }


  @Override

  //Your code here

  public int compareTo(Swimmer otherSwimmer) {
    int curr = this.getAverageTime(freestyle50mTimes);
    int other = otherSwimmer.getAverageTime(freestyle50mTimes);

    if (curr == other) {
      return 0;
    }else if (curr < other){
      return 1;
    } else {
        return -1;

      }
    }

  @Override
  public String toString() {
    return "Swimmer{" +
        "name='" + name + '\'' +
        ", butterfly50mTimes=" + butterfly50mTimes +
        ", backstroke50mTimes=" + backstroke50mTimes +
        ", breaststroke50mTimes=" + breaststroke50mTimes +
        ", freestyle50mTimes=" + freestyle50mTimes +
        '}';
  }

}
