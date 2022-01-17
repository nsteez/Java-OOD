package problem1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleOperatorProcessor {
  private List<VehicleOperator> operators;

  public VehicleOperatorProcessor(List<VehicleOperator> operators) {
    this.operators = operators;
  }

  private VehicleOperatorProcessor(VehicleOperator operator1, VehicleOperator operator2){
    this.operators.add(operator1);
    this.operators.add(operator2);
  }

  /**
   * Method that takes a vehicleOperator, make and model as a parameter. It creates a filtered list
   * of vehicles that are equal to the make and model input
   * @param operator - a List of operated vehicles
   * @param make - car make
   * @param model - car model
   * @return - List of vehicles
   */
  public static List<Vehicle> mysteryMethod(VehicleOperator operator, String make, String model){
    return operator.getOperatedVehicles().stream()
        .filter(x -> x.getMake().equals(make) && x.getModel().equals(model))
        .collect(Collectors.toList());
  }

  /**
   * Method returns the list of names of all Vehicle Operators who operate at
   * least one vehicle older than or equal to the input argument manufacturingYear
   * @param manufacturingYear - year car was manufactured
   * @return - List of vehicle Operators
   */
  public List<String> filterByManufacturingYear(LocalDate manufacturingYear){
    List<String> result = operators.stream()
        .filter(x -> x.getOperatedVehicles().stream()
            .anyMatch(xx -> xx.getYearManufactured().getYear() <= manufacturingYear.getYear()))
        .map(VehicleOperator::getName)
        .collect(Collectors.toList());

    return result;
  }
}
