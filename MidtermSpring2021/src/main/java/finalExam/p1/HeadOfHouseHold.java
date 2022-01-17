package finalExam.p1;

/**
 * Represents a GroupFIler that is the Head of a household.
 */
public class HeadOfHouseHold extends AbstractGroupFiler{

  public HeadOfHouseHold(String taxId, ContactInfo contactInfo) {
    super(taxId, contactInfo);
  }

  /**
   * Calculates the tax for a tax filer.
   *
   * @return calculated tax for the tax filer as a Double.
   */
  @Override
  public Double calculateTax() {
    return super.calculateTax();
  }
}
