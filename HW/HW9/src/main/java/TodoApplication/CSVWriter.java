package TodoApplication;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CSVWriter {
  private Todo todo;
  private List <String> lines;

  public CSVWriter(){


  }

  //protected void FileWriter(){
  public void FileWriter(Todo todo){
    try{
      BufferedWriter out = new BufferedWriter(new FileWriter("testingFileWriter/testing1.txt"));
      out.write(todo.getID().toString()+ ", ");
      out.write(todo.getText() + ", ");
      out.write(todo.getCompleted().toString() + ", ");
      out.write(todo.getPriority().toString()+ ", ");
      out.write(todo.getCategory() + ", ");
      out.write(todo.getDueDate() + "\n");

      out.close();
      System.out.println("File Created");

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("An error has occurred");

    }
  }

//  protected String[] getArray(){
//
//  }


 protected Map<String, String> writeFile(String path) throws IOException{
    lines = new ArrayList<>();
    while (line = wri)
    return writeFile(null);

  }


}
