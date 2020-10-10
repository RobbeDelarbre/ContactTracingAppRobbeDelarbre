package ui.controller;

import domain.model.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteAccountFinal extends RequestHandler{

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        if (request.getParameter("ja") != null){
            Person p = (Person) request.getSession(false).getAttribute("user");
            service.delete(p.getUserid());
            request.getSession().invalidate();
            return "accountDeletedConfirmation.jsp";
        } else if (request.getParameter("nee") != null){
            return "Servlet?command=Account";
        }
        return "index.jsp";
    }
}
