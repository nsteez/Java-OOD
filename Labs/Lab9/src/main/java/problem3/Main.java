package problem3;

import java.util.function.Supplier;

public class Main {

  /**
   * The lambda expressions can be used to eliminate the need for an explicit factory class.
   * @param args
   */
  public static void main(String[] args){
    Supplier<DirtVacuumCleaner> dvcSupplier = DirtVacuumCleaner::new;
    DirtVacuumCleaner dvc = dvcSupplier.get();
    dvc.vacuum();
    dvc.clean();

    Supplier<WaterVacuumCleaner> wvcSupplier = WaterVacuumCleaner::new;
    WaterVacuumCleaner wvc = wvcSupplier.get();
    wvc.vacuum();
    wvc.clean();
  }

}
