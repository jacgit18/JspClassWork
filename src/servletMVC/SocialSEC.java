package servletMVC;

import java.io.*;


public class SocialSEC implements Serializable {
//  private final stateAbbreviation;
  private String SSN;
////
//	public SocialSEC(String sSN) {
//		super();
//		SSN = sSN;
//	}
  
  public String getSSN() {
    return (SSN);
  }
  
//public SocialSEC(String SSN, String stateAbbreviation) {
	  public void SetSSN(String SSN) {

  this.SSN = SSN;
//  this.stateAbbreviation = stateAbbreviation;
}


//
//  public String getStateAbbreviation() {
//    return (stateAbbreviation);
//  }
}
