package ui.controller;

import domain.model.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class Add extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        List<String> errors = new ArrayList<>();

        Person p = new Person();
        setPUserId(p, request, errors);
        setPFirstname(p, request, errors);
        setPLastname(p, request, errors);
        setPEmail(p, request, errors);
        setPPassword(p, request, errors);

        if (errors.size() == 0){
            try {
                service.add(p);
                return "Servlet?command=overview";
            } catch (Exception e) {
                errors.add(e.getMessage());
            }
        }
        request.setAttribute("errors", errors);
        return "Servlet?command=register";
    }

    private void setPEmail(Person p, HttpServletRequest request, List<String> errors) {
        String email = request.getParameter("email");

        try{
            p.setEmail(email);
            request.setAttribute("emailPrevious", email);
        } catch (Exception e){
            errors.add(e.getMessage());
        }
    }

    private void setPFirstname(Person p, HttpServletRequest request, List<String> errors) {
        String firstname = request.getParameter("firstname");

        try{
            p.setFirstName(firstname);
            request.setAttribute("firstnamePrevious", firstname);
        } catch (Exception e){
            errors.add(e.getMessage());
        }
    }

    private void setPLastname(Person p, HttpServletRequest request, List<String> errors) {
        String lastname = request.getParameter("lastname");

        try {
            p.setLastName(lastname);
            request.setAttribute("lastnamePrevious", lastname);
        } catch (Exception e){
            errors.add(e.getMessage());
        }
    }

    private void setPPassword(Person p, HttpServletRequest request, List<String> errors) {
        String password = request.getParameter("parameter");

        try{
            p.setPassword(password);
            request.setAttribute("passwordPrevious", password);
        } catch (Exception e){
            errors.add(e.getMessage());
        }
    }

    private void setPUserId(Person p, HttpServletRequest request, List<String> errors) {
        String userId = request.getParameter("userid");

        try {
            p.setUserid(userId);
            request.setAttribute("userIdPrevious", userId);
        } catch (Exception e){
            errors.add(e.getMessage());
        }
    }
}
