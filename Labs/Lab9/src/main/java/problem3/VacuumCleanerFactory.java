package problem3;

public class VacuumCleanerFactory {

  public static VacuumCleaner getInstance (String type){
    VacuumCleaner vacuumCleaner = null;

    if ("Dirt".equals(type)){
      vacuumCleaner = new DirtVacuumCleaner();

    } else if ("Water".equals(type)){
      vacuumCleaner = new WaterVacuumCleaner();
    } else{
      System.out.println("sorry can't clean that");
    }
    return vacuumCleaner;
  }

}
