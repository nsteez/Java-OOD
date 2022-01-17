package TodoApplication;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args){
    Map<String, String> ST = new HashMap<>();
    ST.put("id","1");
    ST.put("text","finish hw9");
    ST.put("completed","false");
    ST.put("due","3/22/2020");
    ST.put("priority","1");
    ST.put("category","school");
    Todo Sandra = new Todo(ST);
    //FileWriter();
    //CSVWriter writer1 = new FileWriter();
    CSVWriter writer1 = new CSVWriter();
    writer1.FileWriter(Sandra);



  }

}
