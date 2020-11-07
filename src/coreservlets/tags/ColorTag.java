package coreservlets.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;


import java.io.*;

public class ColorTag extends SimpleTagSupport {
	
	private String foregroundColor;
	private String backgroundColor;

	public void setForegroundColor(String foregroundColor){
		this.foregroundColor = foregroundColor;
	}
	
	public void setBackgroundColor(String backgroundColor){
		this.backgroundColor = backgroundColor;
	}
	
	StringWriter sw = new StringWriter();

//	@Override
	  public void doTag() throws JspException, IOException {
		  if(!foregroundColor.equals("")){
			  // use message from attribute 
			  JspWriter out = getJspContext().getOut();
			    out.println("foreground Color = " + foregroundColor + "/nbackground Color = " + backgroundColor);
		  } else {
			  // use message from body 
			  getJspBody().invoke(sw);
			  getJspContext().getOut().println(sw.toString());
		  }
	  
	  }

}
