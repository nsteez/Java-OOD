package problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


  public static void main(String[] args) {
    List <Integer> numList = new ArrayList<>();
    numList.add(1);
    numList.add(1);
    numList.add(1);
    numList.add(2);
    numList.add(2);
    numList.add(3);
    numList.add(3);
    numList.add(4);
    numList.add(4);
    numList.add(4);
    Main obj = new Main();
    obj.input(numList);
  }


  public Map<Integer, Double> input(List<Integer> numList) {
    Map <Integer, Double> numsMap = new HashMap<>();
    Integer total = numList.size();
    for (Integer num: numList
    ) {
      if (!numsMap.containsKey(num)) {
        numsMap.put(num, 1.0 / total);
      } else {
        Double frequency = numsMap.get(num) + 1.0/total;
        numsMap.put(num, frequency);
      }
    }
    return numsMap;
  }
}

