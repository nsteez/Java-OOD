package Problem1;

import java.util.Objects;

/**
 * Represents Service done inside the home.
 */
public abstract class AbstractInterior extends AbstractNonSpecialist{

  private int numPets; // number of pets in the residence.
  private final double oneOrTwoPetFee = 1.05; // fee increase for having one or two pets
  private final double threeOrMorePetFee = 1.07; // fee increase for having more than 3 pets

  /**
   * Constructor for AbstractInterior class.
   * @param serviceLocation -tell whether a property size is small medium or large.
   * @param isMonthly -boolean of true for if a monthly subscription exist false otherwise.
   */
  public AbstractInterior(Property serviceLocation, boolean isMonthly) {
    super(serviceLocation, isMonthly);
    this.numPets = serviceLocation.getNumOfPets();
  }

  /**
   * Calculates rate increase if property has pets
   * @return results
   */
  protected double getInteriorPetServiceFee() {
    if (numPets == 1 || numPets == 2) {
      return getBaseRate() * oneOrTwoPetFee;
    } else if (numPets > 3) {
      return getBaseRate() * threeOrMorePetFee;
    } else {
      return 1;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (!super.equals(o)) {
      return false;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (this == o) {
      return true;
    }

    AbstractInterior that = (AbstractInterior) o;
    return numPets == that.numPets
        && Double.compare(that.oneOrTwoPetFee, oneOrTwoPetFee) == 0
        && Double.compare(that.threeOrMorePetFee, threeOrMorePetFee) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), numPets, oneOrTwoPetFee, threeOrMorePetFee);
  }

  @Override
  public String toString() {
    return "AbstractInterior{" +
        "numPets=" + numPets +
        ", oneOrTwoPetFee=" + oneOrTwoPetFee +
        ", threeOrMorePetFee=" + threeOrMorePetFee +
        '}';
  }
}
