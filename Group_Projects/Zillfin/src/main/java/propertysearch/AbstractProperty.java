package propertysearch;

import java.util.Objects;

/**
 *Abstract class implementing common fields / behaviors for all properties.
 */
public abstract class AbstractProperty {
  private String address;
  private Integer size;


  public AbstractProperty(String address, Integer size)
      throws NegativeNumberException {
    this.address = address;
    validateSize(size);
    this.size = size;
  }

  /**
   * Validates the size of the property
   * @param size the given size
   * @throws NegativeNumberException if size is less than or equal to zero.
   */
  protected final void validateSize(Integer size) throws NegativeNumberException {
    if (size <= 0){
      throw new NegativeNumberException();
    }
  }

  /**
   * Gets address
   * @return address
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * Gets size
   * @return size
   */
  public Integer getSize() {
    return this.size;
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
    AbstractProperty that = (AbstractProperty) o;
    return Objects.equals(this.address, that.address) && Objects
        .equals(this.size, that.size);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.address, this.size);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "AbstractProperty{" +
        "address='" + this.address + '\'' +
        ", size=" + this.size +
        '}';
  }
}
