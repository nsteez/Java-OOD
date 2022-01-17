package problem2;

public class ElementNodeSet implements ISet{
  private Integer num;
  private ISet next;

  public ElementNodeSet(Integer num,ISet next){
    this.num = num;
    this.next = next;
  }

  /**
   * Checks to see if the Set is empty
   */
  @Override
  public Boolean isEmpty() {
    return null;
  }

  /**
   * Adds a number to a set, if number doesnt already exist in a set.
   *
   * @param num - to add
   * @return boolean
   */
  @Override
  public ISet add(Integer num) throws IllegalArgumentException{
    if(this.contains(num))
      throw new IllegalArgumentException("num already exist");
    else return new ElementNodeSet(num, this);
  }

  /**
   * Boolean to check that an integer exist in the set.
   *
   * @param numA to check
   * @return boolean
   */
  @Override
  public Boolean contains(Integer numA) {
    if(this.num.equals(numA)){
      return true;
    }
    return this.next.contains(numA);
  }

  /**
   * Removes a num in the set.
   *
   * @param num
   * @return
   */
  @Override
  public ISet remove(Integer num) throws IllegalArgumentException{
    if(!this.contains(num))
      throw new IllegalArgumentException("num doesnt exist in set");
    if (num.equals(this.num)){
      return this.next;
    }
    this.next = this.next.remove(num);
    return this;
  }

  /**
   * Returns the size.
   *
   * @return Integer
   */
  @Override
  public Integer size() {
    return 1 + this.next.size();
  }

}
