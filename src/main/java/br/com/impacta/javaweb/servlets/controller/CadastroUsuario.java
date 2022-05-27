package br.com.impacta.javaweb.servlets.controller;

import br.com.impacta.javaweb.servlets.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroUsuario", value = "/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
    //@Override
    //protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("nome"));
        usuario.setLogin(request.getParameter("login"));
        usuario.setEmail(request.getParameter("email"));
        usuario.setSenha(request.getParameter("senha" +
                ""));

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Cadastro realizado com sucesso!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Cadastro realizado com sucesso!!!<h1>");
        out.println("<h4> Nome:</h4>" + usuario.getNome());
        out.println("<h4> Nome:</h4>" + usuario.getLogin());
        out.println("<h4> Nome:</h4>" + usuario.getEmail());
        out.println("</body>");
        out.println("</html>");

    }
}
