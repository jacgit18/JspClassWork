package coreservletsbean;

public class student {

	private String SSN = "";

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String ssn) {
		if (!isEmpty(ssn)) {
			SSN = ssn;
		}
	}
	
	 private boolean isEmpty(String value) {
		    return((value == null) || (value.trim().equals("")));
		  }

}
