package automator;

import java.util.Map;
import java.util.Objects;

/**
 * Supporter class containing the Map of Nonprofit supporters
 */
public class Supporter {
  private Map<String, String> profile;

  /**
   * Constructor for Supporter class
   * @param profile - all the data pertaining to the supporter
   */
  public Supporter(Map<String, String> profile) {
    this.profile = profile;
  }

  /**
   * Gets the value from the Map
   * @param key - key
   * @return value
   */
  public String getValue(String key)   {
    return profile.get(key);
  }

  /**
   * @param o an object for comparison
   * @return True if equal, False if not equal.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Supporter supporter = (Supporter) o;
    return Objects.equals(profile, supporter.profile);
  }

  /**
    * @return A unique hashCode pertaining to this supporter.
   */
  @Override
  public int hashCode() {
    return Objects.hash(profile);
  }

  /**
   * @return a string concatenation of Supporter
   */
  @Override
  public String toString() {
    return "Supporter{" +
        "profile=" + profile +
        '}';
  }
}