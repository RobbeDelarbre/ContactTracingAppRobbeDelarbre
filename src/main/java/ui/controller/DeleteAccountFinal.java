package ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAccountFinal extends RequestHandler{

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        if (request.getParameter("submit").equals("Ja")){
            request.getSession().invalidate();
            return "accountDeletedConfirmation.jsp";
        } else if (request.getParameter("submit").equals("Nee")){
            return "index.jsp";
        }
        return "index.jsp";
    }
}
