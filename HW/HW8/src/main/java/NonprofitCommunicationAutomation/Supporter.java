package NonprofitCommunicationAutomation;

import java.util.Map;

public class Supporter {
  private Map<String, String> profile;

  public Supporter(Map<String, String> profile) {
    this.profile = profile;
  }

  public String getValue(String key) {
    return profile.get(key);
  }

  public Map<String, String> getProfile() {
    return profile;
  }

  @Override
  public String toString() {
    return "Supporter{" +
        "profile=" + profile +
        '}';
  }
}
