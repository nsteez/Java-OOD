package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FoodItemsTest {

  FoodItems apple;
  FoodItems banana;
  FoodItems peach;


  @Before
  public void setUp() throws Exception {
    apple = new Fruit("Apple", 0.50, 10, 2032021, 2172021);
    banana = new Fruit("Banana", 3.0, 12,2032021,2172021);
    //testFoodItem3 = new Rice("Jasmine", 5.0, 12);


  }

  @Test
  public void getName() {
    assertEquals("Apple", apple.getName());
  }

  @Test
  public void getPricePerUnit() {
    assertEquals(0.5, apple.getPricePerUnit(),0);
  }

  @Test
  public void getAvailableQuantity() {
    assertEquals(10, apple.getAvailableQuantity(),0);
  }

  @Test
  public void getMaxQuantity() {
    assertEquals(100, apple.getMaxQuantity(), 0);
  }


 @Test
  public void testEquals() {
    assertTrue(apple.equals(banana));
    Fruit peach = new Fruit("Peach", 3.0, 12,2032021,2172021);
    assertFalse(apple.equals(peach));
  }
//
//  @Test
//  public void testEqualsSymmetry() {
//    assertTrue(apple.equals(testFoodItem2) == testFoodItem2.equals(apple));
//
//  }
//
//  @Test
//  public void testEqualsNullTest() {
//    assertFalse(apple.equals(null));
//
//  }
//
//  @Test
//  public void testEqualsTransitivity() {
//    testFoodItem2 = apple;
//    testFoodItem3 = apple;
//    assertTrue(apple.equals(testFoodItem2) && testFoodItem2.equals(testFoodItem3) && apple
//        .equals(testFoodItem3));
//    // assertTrue(apple.equals(testFoodItem2));
//
//  }
// @Test
//  public void testEqualsConsistency() {
//    Boolean testResult = apple.equals(testFoodItem2);
//    assertEquals(testResult, apple.equals(testFoodItem2));
//  }

  @Test
  public void testHashCode() {
    //assertTrue("Spaghetti").hashCode() == testFoodItem2.hashCode();
    assertTrue(new Fruit("Banana", 3.0, 12, 2032021,2172021).hashCode() == banana.hashCode());
  }

//  @Test
//  public void testToString() {
//    assertEquals("fdsgd", apple.toString());
//
//  }
}