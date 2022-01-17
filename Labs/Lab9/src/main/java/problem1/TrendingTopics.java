package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TrendingTopics{

  public static Map<String,Long> countTopics(List<String>topics){
    //Map<String, Integer> result = topics.stream().collect(groupingBy(String::))
    Map<String, Long> result = topics.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    return result;

  }

  public static void main(String[] args){
    List<String> topics = new ArrayList<>();
    topics.add("Seattle");
    topics.add("wildfires");
    topics.add("DEFCON26");
    topics.add("NEU");
    topics.add("NEU");
    topics.add("Seattle");
    topics.add("Seattle");
    topics.add("NEU");
    topics.add("DEFCON26");
    topics.add("wildfires");

    System.out.println(topics);
    System.out.println(countTopics(topics));


  }





}
