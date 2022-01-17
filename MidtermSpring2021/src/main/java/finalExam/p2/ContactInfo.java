package finalExam.p2;

import java.util.Objects;

/*
 Class ContactInfo contains information about a person's physical address,
 their phone number and email address.
 */
public class ContactInfo {
  private String streetAndNumber;
  private String city;
  private String state;
  private String ZIPcode;
  private String phoneNumber;
  private String emailAddress;

  public ContactInfo(String streetAndNumber, String city,
      String state, String ZIPcode, String phoneNumber,
      String emailAddress) {
    this.streetAndNumber = streetAndNumber;
    this.city = city;
    this.state = state;
    this.ZIPcode = ZIPcode;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }

  public String getStreetAndNumber() {
    return streetAndNumber;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZIPcode() {
    return ZIPcode;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ContactInfo)) return false;
    ContactInfo that = (ContactInfo) o;
    return Objects.equals(getStreetAndNumber(), that.getStreetAndNumber()) &&
        Objects.equals(getCity(), that.getCity()) &&
        Objects.equals(getState(), that.getState()) &&
        Objects.equals(getZIPcode(), that.getZIPcode()) &&
        Objects.equals(getPhoneNumber(), that.getPhoneNumber()) &&
        Objects.equals(getEmailAddress(), that.getEmailAddress());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getStreetAndNumber(), getCity(),
        getState(), getZIPcode(), getPhoneNumber(), getEmailAddress());
  }
}

