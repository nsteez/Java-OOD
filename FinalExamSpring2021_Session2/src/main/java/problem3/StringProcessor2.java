package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import sun.text.resources.CollationData;

public class StringProcessor2 {

  public StringProcessor2() {
  }

  public class replaceOutput {
    public String original;
    public String replaced;
    public Integer timesReplaced;

    public replaceOutput(String original, String replaced, Integer timesReplaced) {
      this.original = original;
      this.replaced = replaced;
      this.timesReplaced = timesReplaced;
    }
  }

  public static List<replaceOutput> replaceAndRepeatLetters(char sourceChar, char destChar,
      int numRepetitions, List<String> stringList){
    List<replaceOutput> result = new ArrayList<>();
      String sourceString = Character.toString(sourceChar);
      String destString = Character.toString(destChar);
      String repeated = Stream.generate(() -> destString).limit(numRepetitions).collect(Collectors.joining());
      //String repeated = destString.repeat(3);


    for(String string : stringList){
      result.add(new replaceOutput(string))
      string.replaceAll(sourceString, repeated);
    }
    return stringList;
  }

  public static void main(String[] args){
    List<String> strings = new ArrayList<>();
    strings.add("puppy");
    strings.add("penguin");
    strings.add("tiger");

    System.out.println(replaceAndRepeatLetters('p','T',3,strings));
  }


}
