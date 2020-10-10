package ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAccountFinal extends RequestHandler{

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        if (request.getParameter("ja") != null){
            request.getSession().invalidate();
            return "accountDeletedConfirmation.jsp";
        } else if (request.getParameter("nee") != null){
            return "Servlet?command=Account";
        }
        return "index.jsp";
    }
}
