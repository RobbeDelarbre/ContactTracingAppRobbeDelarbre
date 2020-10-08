package ui.controller;

import domain.model.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        try{
            String userId = request.getParameter("userId").trim();
            Person person = getService().get(userId);

            if (person != null){
                if (person.isCorrectPassword(request.getParameter("password"))){
                    HttpSession session = request.getSession();
                    session.setAttribute("user", person);
                } else {
                    request.setAttribute("error", "Passwoord is niet juist.");
                    request.setAttribute("userIdPrevious", userId);
                }
            } else {
                request.setAttribute("error", "UserId bestaat niet.");
            }

        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }

        return "Servlet?command=Home";
    }
}
