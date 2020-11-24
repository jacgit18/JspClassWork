package coreservletmvc;

import java.io.*;

// Serializable because we store the bean in the session in one of the exercises

public class StatePair implements Serializable {
  private final String stateName, stateAbbreviation;

  public StatePair(String stateName, String stateAbbreviation) {
    this.stateName = stateName;
    this.stateAbbreviation = stateAbbreviation;
  }
  
  public String getStateName() {
    return (stateName);
  }

  public String getStateAbbreviation() {
    return (stateAbbreviation);
  }
}
