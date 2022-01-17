package TheaterReservationSystem;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Stack;
//
//public class Testing {
//
//  public boolean isValid(String s){
//
//    return false;
//  }
//
//  public static Boolean validation(String s){
//    String[] sList = {"(","{","["};
//    String[] eList = {")", "}", "]"};
//    //String[] matches = {"()","{}","[]"};
//    List<String> start = new ArrayList<>(Arrays.asList(sList));
//    List<String> end = new ArrayList<>(Arrays.asList(eList));
//
//
//    Stack <String> stack = new Stack();
//    String[] string = s.split("");
//    String open = "";
//
//
//    for(String str : string){
//      if(start.contains(str)) {
//        stack.push(str);
//
//      } else if(end.contains(str)){
////        stack.push(str);
//        if(stack.isEmpty()){
//          return false;
//        }
//        open = stack.pop();
//        if (str.equals(")")){
//          if (!open.equals("("))
//            return false;
//        }else if(str.equals("}")){
//          if (!open.equals("{"))
//            return false;
//        } else if(str.equals("]")){
//          if (!open.equals("["))
//            return false;
//        }
//        }
//      }
//    return stack.isEmpty();
//    }
//
//
//
//  public static void main(String[] args){
//    String s = "([)]";
//    validation(s);
//
//  }
//}

//
//  public static String match1(String s){
//    String[] start = {"(", "{", "["};
//    Arrays.asList(s);
//    String match = "";
//    for(char ch : s.toCharArray()){
//      for (int i = 0; i < start.length; i++){
//        String str = String.valueOf(ch);
//        if(str.equals(start[i])){
//          match = str;
//          break;
//        }
//      }
//    }
//    return match;
//
//  }
//
//  public static String match2(String s){
//    String[] end = {")", "}", "]"};
//    Arrays.asList(end);
//
//    String match = "";
//    for(char ch : s.toCharArray()){
//      for (int i = 0; i < end.length; i++){
//        String str = String.valueOf(ch);
//        if(str.equals(end[i])){
//          match = str;
//
//        }
//      }
//    }
//    return match;
//
//  }
//  public static boolean isValid(String s) {
//    String one = match1(s);
//    String two = match2(s);
//
//    if(s.indexOf(one) < s.indexOf(two)){
//      System.out.println("yes");
//
//    }
//    return true;
//
//
//  }
//
//
//  public static void main(String[] args){
//    String s = "([)]";
//    System.out.println(isValid(s));
//
//
//    }
//}

import java.lang.reflect.Array;
import java.util.Scanner;
//
//import java.util.*;
//public class Testing {
//
//    public static int reverse(int x) {
//      String b = Integer.toString(x);
//      String[] xx = b.split("");
//      System.out.println(Arrays.toString(xx));
//      if(xx[0] == "-"){
//        xx[0] = "";
//        int re = xx.length;
//        xx[re + 1] = "-";
//
//      }
//      for (int i = xx.length; i != 0; i--){
//        System.out.print(i);
//      }
//      return 1111111111;
//    }
//    public static void main (String[] args){
//      int x = -123;
//      reverse(x);
//    }
//  }
import java.util.*;
public class Testing {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 0;
    reversing(x);

  }

  public static int reversing(int x) {

    String arr = Integer.toString(x);

    if (arr.length() == 1) {
      char ch = arr.charAt(0);
      int a = (int) (ch);
      return a;

    } else if (x < 0) {
      x = x * -1;
      String[] result = new String[arr.length() + 1];
      result[0] = "-";
      for (int i = arr.length() - 1; i > 0; i--) {
        result[i] = result[arr.charAt(i)];
        return 0;

      }
    } else {
      for (int i = arr.length() - 1; i > 0; i--) {
        System.out.print(arr.charAt(i));
        return 0;

      }
    }
  }

}






