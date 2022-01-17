package Problem1;

import java.util.Objects;

public class Runner extends Athlete {
  private Double best5kTime;
  private Double bestHalfMarathonTime;
  private String favRunningEvent;

  /**
   *Constructs a new Runner, based upon all the provided input parameters.
   * @param athletesName - name of Athlete.
   * @param height - height of Athlete.
   * @param weight - weight of Athlete.
   * @param league - league of Athlete.
   * @param best5kTime - best 5k time for runner.
   * @param bestHalfMarathonTime - best half marathon time for Runner.
   * @param favRunningEvent - favorite running event for Runner.
   */
  public Runner(Name athletesName, Double height, Double weight, String league,
      Double best5kTime, Double bestHalfMarathonTime, String favRunningEvent){
    super(athletesName, height, weight, league);
    this.best5kTime = best5kTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favRunningEvent = favRunningEvent;

  }

  /**
   *Constructs a new Runner, based upon all the provided input parameters.
   * @param athletesName - name of Athlete.
   * @param height - height of Athlete.
   * @param weight - weight of Athlete.
   * @param best5kTime - best 5k time for Runner.
   * @param bestHalfMarathonTime - best half marathon time for Runner.
   * @param favRunningEvent - favorite running event for Runner.
   */
  public Runner(Name athletesName, Double height, Double weight,
         Double best5kTime, Double bestHalfMarathonTime, String favRunningEvent){
    super(athletesName, height, weight);
    this.best5kTime = best5kTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favRunningEvent = favRunningEvent;

  }

  public Double getBest5kTime() {
    return best5kTime;
  }
  public Double getBestHalfMarathonTime() {
    return bestHalfMarathonTime;
  }
  public String getFavRunningEvent() {
    return favRunningEvent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Runner runner = (Runner) o;
    return Objects.equals(best5kTime, runner.best5kTime) && Objects
        .equals(bestHalfMarathonTime, runner.bestHalfMarathonTime) && Objects
        .equals(favRunningEvent, runner.favRunningEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(best5kTime, bestHalfMarathonTime, favRunningEvent);
  }
}
