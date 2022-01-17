package finalExam.p2;

import java.time.LocalDate;

public class ElementNode implements ITaxReturnSystem{
  private TaxReturn taxReturn;
  private ITaxReturnSystem next;


  public ElementNode(TaxReturn taxReturn, ITaxReturnSystem next) {
    this.taxReturn = taxReturn;
    this.next = next;
  }

  /**
   * Check whether or not the TaxReturnSystem is empty.
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Count the number of TaxReturns in the TaxReturnSystem.
   */
  @Override
  public Integer count() {
    return 1 + next.count();
  }

  /**
   * Add a TaxReturn to the TaxReturnSystem. Please note that TaxReturnSystem does not allow
   * duplicate TaxReturns.
   *
   * @param taxReturn
   * @return
   * @throws DuplicateException
   */
  @Override
  public ITaxReturnSystem add(TaxReturn taxReturn) throws DuplicateException {
    if (this.contains(taxReturn)) {
      throw new DuplicateException();
    }
    return new ElementNode(taxReturn, this);
  }

  /**
   * Remove a specified TaxReturn from the TaxReturnSystem. If the TaxReturn doesn’t exist in the
   * TaxReturnSystem, the system should throw TaxReturnNotFoundException
   *
   * @param taxReturn
   * @return
   * @throws TaxReturnNotFoundException
   */
  @Override
  public ITaxReturnSystem remove(TaxReturn taxReturn) throws TaxReturnNotFoundException {
    if (this.taxReturn.equals(taxReturn)){
      return next;
    }
    this.next = this.next.remove(taxReturn);
    return this;
  }

  /**
   * Check for a specified TaxReturn in the TaxReturnSystem.
   *
   * @param taxReturn
   * @return
   */
  @Override
  public Boolean contains(TaxReturn taxReturn) {
    if (this.taxReturn.equals(taxReturn)){
      return true;
    }
    return next.contains(taxReturn);
  }

  /**
   * Check if a specified TaxReturn in the TaxReturnSystem was filled on a specified date. If the
   * TaxReturn doesn’t exist in the TaxReturnSystem, the system should throw
   * TaxReturnNotFoundException.
   *
   * @param taxReturn
   * @param date
   * @return
   */
  @Override
  public Boolean checkDate(TaxReturn taxReturn, LocalDate date)throws TaxReturnNotFoundException {
    if (this.taxReturn.equals(taxReturn)){
      return taxReturn.getDateTaxReturnFilled().equals(date);
    }
    return next.checkDate(taxReturn,date);
  }

  /**
   * Check if a specified TaxReturn in the TaxReturnSystem has already been processed, as indicated
   * by the field taxApplicationProcessed within the class TaxReturn. If the TaxReturn doesn’t exist
   * in the TaxReturnSystem, the system should throw TaxReturnNotFoundException.
   *
   * @param taxReturn
   * @return
   */
  @Override
  public Boolean Processed(TaxReturn taxReturn) throws TaxReturnNotFoundException {
    if(this.taxReturn.equals(taxReturn)){
      return taxReturn.getTaxApplicationProcessed();
    }

    return next.Processed(taxReturn);
  }

  /**
   * Find and return all TaxReturns from the TaxReturnSystem who have overpaid more than $500 in
   * taxes.
   *
   * @param taxReturn
   * @return
   */
  @Override
  public ITaxReturnSystem CheckOverpaid(TaxReturn taxReturn) {
    ITaxReturnSystem next2 = this.next.CheckOverpaid(taxReturn);
    if (this.taxReturn.getAmountOfTaxesOverpaid() > 500) {
      return new ElementNode(this.taxReturn, next2);
    }
    return next2;
  }

  /**
   * Find and return all TaxReturns from the TaxReturnSystem who have overpaid more than $500 in
   * taxes.
   *
   * @return
   */
  @Override
  public ITaxReturnSystem CheckTIN(String TIN) throws InvalidTaxIdentificationNumberException {
    ITaxReturnSystem next2 = this.next.CheckOverpaid(taxReturn);
    if (this.taxReturn.getTIN().equals(TIN)) {
      return new ElementNode(this.taxReturn, next2);
    }
    return next2;
  }
}
