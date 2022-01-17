package todoApplication.model;

public class Command {
  private String name;
  private Boolean required;
  private Boolean needsFollowingArg;
  private String mustBeProvidedCommand;
  private String mustNotBeProvidedCommand;

  public Command(String name, Boolean required, Boolean needsFollowingArg) {
    this.name = name;
    this.required = required;
    this.needsFollowingArg = needsFollowingArg;
  }

  public Command(String name, Boolean required, Boolean needsFollowingArg,
      String mustBeProvidedCommand, String mustNotBeProvidedCommand) {
    this.name = name;
    this.required = required;
    this.needsFollowingArg = needsFollowingArg;
    this.mustBeProvidedCommand = mustBeProvidedCommand;
    this.mustNotBeProvidedCommand = mustNotBeProvidedCommand;
  }

  public String getName() {
    return this.name;
  }

  public Boolean isRequired() {
    return this.required;
  }

  public Boolean needsFollowingArg() {
    return this.needsFollowingArg;
  }

  public String getMustBeProvidedCommand() {
    return this.mustBeProvidedCommand;
  }

  public String getMustNotBeProvidedCommand() {
    return this.mustNotBeProvidedCommand;
  }
}
