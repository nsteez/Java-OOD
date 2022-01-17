package problem2;

import java.util.Objects;

/**
 * Represents an individual person, either an Author or a RecordingArtist.
 */
public abstract class Creator {
    private String firstName;
    private String lastName;

    public Creator(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Creator creator = (Creator) o;
    return Objects.equals(firstName, creator.firstName) && Objects
        .equals(lastName, creator.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    return "Creator{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
