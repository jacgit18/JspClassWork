package servletMVC;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/show-abbreviation")
public class validateLogin extends HttpServlet {
  private StateAbbreviationService abbreviationMapper = new StateAbbreviationMapper();
  
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String stateName = request.getParameter("state-name");
    if (stateName == null) {
      stateName = "";
    }
    stateName = stateName.trim();
    String stateAbbreviation = abbreviationMapper.findAbbreviation(stateName);
    StatePair stateInfo1 = new StatePair(stateName, stateAbbreviation);
    HttpSession session = request.getSession(); // using session
    session.setAttribute("stateInfo2", stateInfo1);
    String address;
    if (stateName.isEmpty()) {
      address = "/WEB-INF/results/missing-state.jsp";
    } else if (stateAbbreviation != null) {
      address = "/WEB-INF/results/show-abbreviation.jsp";
    } else {
      address = "/WEB-INF/results/unknown-state.jsp";
    }
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
