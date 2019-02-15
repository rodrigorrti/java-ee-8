package servlet;

import cdi.ApplicationBean;
import cdi.RequestBean;
import cdi.SessionBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cavera")
public class CaveraServlet extends HttpServlet {

    @Inject
    private ApplicationBean appBean;

    @Inject
    private SessionBean sessBean;

    @Inject
    private RequestBean reqBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Funfs!!!");

        resp.getWriter().append("<h1>OK Caveira</h1>");
        resp.getWriter().append("<h1>ApplicationBean: " + appBean.imprimeContador() + "</h1>");
        resp.getWriter().append("<h1>SessionBean: " + sessBean.imprimeContador() + "</h1>");
        resp.getWriter().append("<h1>RequestBean: " + reqBean.imprimeContador() + "</h1>");

        //Imprime no console
        System.out.println("ApplicationBean: " + appBean.imprimeContador());
        System.out.println("SessionBean: " + sessBean.imprimeContador());
        System.out.println("RequestBean: " + reqBean.imprimeContador());

    }
}
