package TheaterReservationSystem;

import java.util.Scanner;

/**
 * Creates a new instance of the Theater and call the service implemented in ReservationService
 */
public class ReservationSystem {
  public ReservationSystem(){

  }

  public static void main(String[] args){
    String reserve = "reserve";
    String show = "show";
    String done = "done";

    Scanner scanner = new Scanner(System.in);

    System.out.println("What would you like to do?");
    String input = scanner.next();
    while (input != done){

      if(scanner.next() == reserve){
        //text
      }else if(scanner.next() == show){
        //text
      }
    }


  }

}
