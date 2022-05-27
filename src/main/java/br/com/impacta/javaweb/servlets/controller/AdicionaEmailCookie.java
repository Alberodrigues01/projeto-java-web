package br.com.impacta.javaweb.servlets.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdicionaEmailCockie", value = "/AdicionaEmailCockie")
public class AdicionaEmailCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String emailRecebido = request.getParameter("email");
        response.addCookie(new Cookie("email", emailRecebido));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.html");
        dispatcher.forward(request, response);

    }
}
