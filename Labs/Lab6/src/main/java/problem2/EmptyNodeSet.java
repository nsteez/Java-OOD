package problem2;

public class EmptyNodeSet implements ISet{

  public EmptyNodeSet(){
  }

  /**
   * Checks to see if the Set is empty
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Adds a number to a set, if number doesnt already exist in a set.
   *
   * @param num - to add
   * @return boolean
   */
  @Override
  public ISet add(Integer num) {
    return new ElementNodeSet(num,this);
  }

  /**
   * Boolean to check that an integer exist in the set.
   *
   * @param num to check
   * @return boolean
   */
  @Override
  public Boolean contains(Integer num) {
    return false;
  }

  /**
   * Removes a num in the set.
   *
   * @param num
   * @return
   */
  @Override
  public ISet remove(Integer num) {
    return this;
  }

  /**
   * Returns the size.
   *
   * @return Integer
   */
  @Override
  public Integer size() {
    return null;
  }
}
