package Problem1;

import java.util.Objects;

public class BaseballPlayer extends Athlete {
  private String Team;
  private Double battingAverage;
  private Integer homeRuns;


  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      Double battingAverage) {
    super(athletesName, height, weight, league);
    this.battingAverage = battingAverage;
  }

  public BaseballPlayer(Name athletesName, Double height, Double weight,
      Double battingAverage) {
    super(athletesName, height, weight);
    this.battingAverage = battingAverage;
  }

  public String getTeam() {
    return Team;
  }

  public Double getBattingAverage() {
    return battingAverage;
  }

  public Integer getHomeRuns() {
    return homeRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseballPlayer that = (BaseballPlayer) o;
    return Objects.equals(Team, that.Team) && Objects
        .equals(battingAverage, that.battingAverage) && Objects
        .equals(homeRuns, that.homeRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Team, battingAverage, homeRuns);
  }
}
