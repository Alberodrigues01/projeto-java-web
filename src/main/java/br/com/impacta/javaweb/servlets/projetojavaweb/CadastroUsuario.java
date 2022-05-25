package br.com.impacta.javaweb.servlets.projetojavaweb;

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


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Cadastro realizado com sucesso!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Cadastro realizado com sucesso!<h1>");
        out.println("<h4> Nome:</h4>" + request.getParameter("nome"));
        out.println("<h4> Login:</h4>" + request.getParameter("login"));
        out.println("</body>");
        out.println("</html>");


        /*String nome=request.getParameter("nome");
        String sobrenome=request.getParameter("sobrenome");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nome +" "+ sobrenome + "</h1>");
        out.println("<h1>" + request.getMethod() + "</h1>");
        out.println("</body></html>");

    }*/
    }
}
