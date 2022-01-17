package Problem2;

import com.sun.org.apache.xpath.internal.operations.Bool;

public interface iList {

  Boolean isEmpty();
  Integer size();
  Boolean contains(String element);
  Boolean containsAll(StringList list);
  StringList filterLargerThan(Integer maxStringLength);
  Boolean hasDuplicates();
  StringList removeDuplicates();





}
