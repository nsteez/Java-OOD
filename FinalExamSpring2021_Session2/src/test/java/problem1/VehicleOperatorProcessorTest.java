package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class VehicleOperatorProcessorTest {
  private Vehicle honda, honda2, ford, porsche;
  private List<Vehicle> vehicles1, vehicles2, expected;
  private VehicleOperatorProcessor testProcessor;
  private VehicleOperator operator1, operator2;
  private LocalDate date1,date2, driversBirth, driversBirth2;

  @Before
  public void setUp() throws Exception {
    date1 = LocalDate.of(2020,1,1);
    date2 = LocalDate.of(2019,1,1);
    driversBirth = LocalDate.of(1981,5,9);
    driversBirth2 = LocalDate.of(1961,5,9);

    honda = new Vehicle("1111","Honda","CRV",date1,20f);
    honda2 = new Vehicle("2222","Honda","CRV",date1,50f);
    ford = new Vehicle("3333","Ford","Explorer",date2,3000f);
    porsche = new Vehicle("4444","Porsche","Taycan",date2,16000f);



    vehicles1 = new ArrayList<>();
    vehicles1.add(honda);
    vehicles1.add(honda2);
    vehicles1.add(ford);
    vehicles1.add(porsche);

    vehicles2 = new ArrayList<>();
    vehicles1.add(honda);
    vehicles1.add(honda2);

    operator1 = new VehicleOperator("Lisa Simpson","1234567", driversBirth,vehicles1);
    operator2 = new VehicleOperator("Marge Simpson","1245367", driversBirth2,vehicles2);

    List<VehicleOperator> operators = new ArrayList<>();
    operators.add(operator1);
    operators.add(operator2);

    testProcessor = new VehicleOperatorProcessor(operators);
  }

  @Test
  public void mysteryMethod() {
    expected = new ArrayList<>();
    expected.add(honda);
    expected.add(honda2);

    assertEquals(expected,VehicleOperatorProcessor.mysteryMethod(operator1,"Honda","CRV"));


  }

  @Test
  public void filterByManufacturingYear() {
    assertEquals(operator1.getName(),
        testProcessor
            .filterByManufacturingYear(LocalDate.of(2019, 1, 1))
            .get(0));
  }
}