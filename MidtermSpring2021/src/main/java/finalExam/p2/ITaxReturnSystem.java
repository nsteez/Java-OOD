package finalExam.p2;

import java.time.LocalDate;

/**
Stores contact and demographic information of a tax filer
 */
public interface ITaxReturnSystem {
  /**
   * Check whether or not the TaxReturnSystem is empty.
   */
  Boolean isEmpty();
 /**
  * Count the number of TaxReturns in the TaxReturnSystem.
  */
  Integer count();

  /**
   * Add a TaxReturn to the TaxReturnSystem. Please note that TaxReturnSystem does not allow duplicate
   * TaxReturns.
   * @param taxReturn
   * @return
   * @throws DuplicateException
   */
  ITaxReturnSystem add(TaxReturn taxReturn)throws DuplicateException;


  /**
   * Remove a specified TaxReturn from the TaxReturnSystem. If the TaxReturn doesn’t exist in the
   * TaxReturnSystem, the system should throw TaxReturnNotFoundException
    * @param taxReturn
   * @return
   * @throws TaxReturnNotFoundException
   */
  ITaxReturnSystem remove(TaxReturn taxReturn) throws TaxReturnNotFoundException;

  /**
   * Check for a specified TaxReturn in the TaxReturnSystem.
   * @return
   */
  Boolean contains(TaxReturn taxReturn);

  /**
   * Check if a specified TaxReturn in the TaxReturnSystem was filled on a specified date. If the
   * TaxReturn doesn’t exist in the TaxReturnSystem, the system should throw TaxReturnNotFoundException.
   * @param taxReturn
   * @param date
   * @return
   */
  Boolean checkDate(TaxReturn taxReturn, LocalDate date) throws TaxReturnNotFoundException;


  /**
   * Check if a specified TaxReturn in the TaxReturnSystem has already been processed, as indicated by
   * the field taxApplicationProcessed within the class TaxReturn. If the TaxReturn doesn’t exist in the
   * TaxReturnSystem, the system should throw TaxReturnNotFoundException.
   * @param taxReturn
   * @return
   */
 Boolean Processed(TaxReturn taxReturn) throws TaxReturnNotFoundException;

  /**
   * Find and return all TaxReturns from the TaxReturnSystem who have overpaid more than $500 in
   * taxes.
   * @param taxReturn
   * @return
   */
 ITaxReturnSystem CheckOverpaid(TaxReturn taxReturn) ;

  /**
   * Find and return all TaxReturns from the TaxReturnSystem who have overpaid more than $500 in
   * taxes.
   * @return
   */
 ITaxReturnSystem CheckTIN(String TIN)throws  InvalidTaxIdentificationNumberException;

















}
