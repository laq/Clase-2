package HomeworkCrud;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Homework.Homework;
import Homework.HomeworkList;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author laq
 */
@WebServlet(urlPatterns = {"/EditHomework"})
public class EditHomework extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sId = request.getParameter("id");
        int id = Integer.parseInt(sId);
        Homework hw = HomeworkList.search(id);
        request.setAttribute("hw", hw);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editHomework.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String folder = request.getParameter("folder");
        int grade = Integer.parseInt(request.getParameter("grade"));
        int id = Integer.parseInt(request.getParameter("id"));

        Homework hw = HomeworkList.search(id);
        hw.setName(name);
        hw.setFolder(folder);
        hw.setGrade(grade);
        request.setAttribute("hw", hw);
        RequestDispatcher dispatcher = request.getRequestDispatcher("showHomework.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
