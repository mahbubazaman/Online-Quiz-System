/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AppUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import service.Service;


public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     
        try{
            
            String email = request.getParameter("email");
            String pass = request.getParameter("pwd");
            
            //System.out.println(email + "  ,  "+pass);
            /*
            appUser.setEmail(email);
            AppUser appUser = new AppUser();
            appUser.setPasword(pass);
            */
            
            
            Service s = new Service();
            int type = s.loginUser(email, pass);
            
            if(type==1){
                System.out.println("Login success : STUDENT");
                 request.getRequestDispatcher("exam.jsp").forward(request, response);
            }else if(type==2){
                 System.out.println("Login success : ADMIN");
                  request.getRequestDispatcher("cpanel.jsp").forward(request, response);
            }else{
                request.setAttribute("error", "Please try with currect email and password");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
            
            /*
            response.setContentType("application/json");
            response.getWriter().write(s.toString());
            */
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

   
}
