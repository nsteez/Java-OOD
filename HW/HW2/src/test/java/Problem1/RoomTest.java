package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {
  private SingleRoom annaliseKeating;
  private SingleRoom nateLahey;
  private DoubleRoom connerWalsh;
  private FamilyRoom bonnieWinterbottom;
  private FamilyRoom emptyRoom;

  @Before
  public void setUp() throws Exception {
    annaliseKeating = new SingleRoom(100.0,1);
    nateLahey = new SingleRoom(110.0,1);
    connerWalsh = new DoubleRoom(130.0,2);
    bonnieWinterbottom = new FamilyRoom(230.0, 4);
    emptyRoom = new FamilyRoom(400.0,0);
  }

  @Test (expected = IllegalArgumentException.class)
  public void invalidGuestJamie(){
    SingleRoom jamieJones = new SingleRoom(150.0, 2);
  }

  @Test
  public void getMaxOccupancy() {
    assertEquals((Integer) 1, annaliseKeating.getMaxOccupancy());
    assertEquals((Integer) 1, nateLahey.getMaxOccupancy());
    assertEquals((Integer) 2, connerWalsh.getMaxOccupancy());
    assertEquals((Integer) 4, bonnieWinterbottom.getMaxOccupancy());
  }

  @Test
  public void getPrice() {
    assertEquals((Double) 100.0, annaliseKeating.getPrice());
    assertEquals((Double) 110.0,nateLahey.getPrice());
    assertEquals((Double) 130.0, connerWalsh.getPrice());
    assertEquals((Double) 230.0, bonnieWinterbottom.getPrice());
  }

  @Test
  public void getNumOfGuest() {
    assertEquals((Integer) 1,annaliseKeating.getNumOfGuest());
    assertEquals((Integer) 1, nateLahey.getNumOfGuest());
    assertEquals((Integer) 2, connerWalsh.getNumOfGuest());
    assertEquals((Integer) 4,bonnieWinterbottom.getNumOfGuest());

  }

  @Test
  public void setNumOfGuest() {
    nateLahey.setNumOfGuest(1);
    assertEquals((Integer) 1, nateLahey.getNumOfGuest());

  }

  @Test
  public void isAvailable() {
    assertTrue("true", emptyRoom.isAvailable());
    assertFalse("false", annaliseKeating.isAvailable());

  }

  @Test
  public void bookRoom() {
    emptyRoom.bookRoom(1);
    annaliseKeating.bookRoom(5);
    assertEquals((Integer) 1, annaliseKeating.getNumOfGuest());
    assertEquals((Integer) 1, emptyRoom.getNumOfGuest());
  }
}