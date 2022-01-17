package propertysearch;

import java.util.Objects;

/**
 * Class Rental represents a Rental contract.
 */
public class Rental extends AbstractContract {

  private Integer term;
  private static final Integer MINIMUM_TERM = 1;

  /**
   * Constructor for Rental.
   *
   * @param askingPrice The asking price.
   * @param negotiable  Is the asking price negotiable.
   * @param term The term of the rental contract in months.
   */
  public Rental(Double askingPrice, Boolean negotiable, Integer term) {
    super(askingPrice, negotiable);
    validateTerm(term);
    this.term = term;
  }

  /**
   * Validates a given rental term
   *
   * @param term the given rental term
   * @throws InvalidTermException if the term is less than 1
   */
  private void validateTerm(Integer term) throws InvalidTermException {
    if (term < MINIMUM_TERM) {
      throw new InvalidTermException();
    }
  }

  /**
   * Returns the term of the rental contract in months
   *
   * @return the term of the rental contract in months
   */
  public Integer getTerm() {
    return this.term;
  }

  /**
   * Returns the total value of the contract
   *
   * @return the total value of the contract
   */
  @Override
  public Double getValue() {
    return super.getValue() * this.term;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Rental rental = (Rental) o;
    return Objects.equals(this.term, rental.term);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.term);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "Rental{" +
        "term=" + this.term +
        "} " + super.toString();
  }
}
