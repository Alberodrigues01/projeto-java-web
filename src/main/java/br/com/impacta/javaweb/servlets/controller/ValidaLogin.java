package br.com.impacta.javaweb.servlets.controller;

import br.com.impacta.javaweb.servlets.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ValidaLogin", value = "/ValidaLogin")
public class ValidaLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Usuario usuario = new Usuario();
        usuario.setLogin(request.getParameter("login"));
        usuario.setSenha(request.getParameter("senha"));

        // login verdadeiro e senha verdadeira
        if (usuario.getLogin() !=null && usuario.getSenha() != null &&
                "123".equals(usuario.getSenha())) {
                request.getSession().setAttribute("usuario" , usuario);

                RequestDispatcher dispatcher = request.getRequestDispatcher("/sistema");
                dispatcher.forward(request, response);

        }else {
         response.sendRedirect("/erroLogin.html");
        }
    }
}
