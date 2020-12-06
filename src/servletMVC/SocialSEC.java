package servletMVC;

import java.io.*;


public class SocialSEC implements Serializable {
//  private final stateAbbreviation;
  private final String SSN;

//  public SocialSEC(String SSN, String stateAbbreviation) {
	  public SocialSEC(String SSN) {

    this.SSN = SSN;
//    this.stateAbbreviation = stateAbbreviation;
  }
  
  public String getStateName() {
    return (SSN);
  }
//
//  public String getStateAbbreviation() {
//    return (stateAbbreviation);
//  }
}
