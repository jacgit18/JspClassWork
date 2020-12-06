package servletMVC;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import dbconnect.DBUtil;


@WebServlet("/searchmysocial")
public class validateLogin extends HttpServlet {
	
	
  private DBUtil SSNPasser = new DBUtil();
  
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String SSN = request.getParameter("SSN");
    if (SSN == null) {
    	SSN = "";
    }
    SSN = SSN.trim();
    
//    String stateAbbreviation = abbreviationMapper.FindSocial(SSN);
    
    String socialPasser = SSNPasser.FindSocial(SSN);

    
//    SocialSEC ssnInfo = new SocialSEC(SSN, stateAbbreviation);
    SocialSEC ssnInfo = new SocialSEC(SSN);

    
    
//    HttpSession session = request.getSession(); // using session
//    session.setAttribute("ssnInfo2", ssnInfo);
    String address;
    if (SSN.isEmpty()) {
      address = "/WEB-INF/results/missing-state.jsp";
    } else if (socialPasser != null) {
      address = "/WEB-INF/results/StudentFound.jsp";
    } else {
      address = "/WEB-INF/results/StudentNotFound.jsp";
    }
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
