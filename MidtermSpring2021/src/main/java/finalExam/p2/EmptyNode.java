package finalExam.p2;

import java.time.LocalDate;

public class EmptyNode implements ITaxReturnSystem{

  public EmptyNode(){

  }

  /**
   * Check whether or not the TaxReturnSystem is empty.
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Count the number of TaxReturns in the TaxReturnSystem.
   */
  @Override
  public Integer count() {
    return 0;
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
    throw new TaxReturnNotFoundException();
  }

  /**
   * Check for a specified TaxReturn in the TaxReturnSystem.
   *
   * @return
   */
  @Override
  public Boolean contains(TaxReturn taxReturn) {
    return false;
  }

  /**
   * Check if a specified TaxReturn in the TaxReturnSystem was filled on a specified date. If the
   * TaxReturn doesn’t exist in the TaxReturnSystem, the system should throw
   * TaxReturnNotFoundException.
   *
   * @param date
   * @return
   */
  @Override
  public Boolean checkDate(TaxReturn taxReturn, LocalDate date) throws TaxReturnNotFoundException{
    throw new TaxReturnNotFoundException();
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
    throw new TaxReturnNotFoundException();
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
    return this;
  }

  /**
   * Find and return all TaxReturns from the TaxReturnSystem who have overpaid more than $500 in
   * taxes.
   *
   * @return
   */
  @Override
  public ITaxReturnSystem CheckTIN(String TIN) throws InvalidTaxIdentificationNumberException {
    throw new InvalidTaxIdentificationNumberException();
  }
}
