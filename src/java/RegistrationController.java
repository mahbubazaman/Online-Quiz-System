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
import service.Service;

public class RegistrationController extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String pass = request.getParameter("pwd");
        
        AppUser appUser = new AppUser();
        appUser.setName(username);
        appUser.setEmail(email);
        appUser.setPasword(pass);
        
        Service s = new Service();
        if(s.AppUserRegistration(appUser)){
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
            request.setAttribute("error", "User email already taken, Please try with another one.");
             request.getRequestDispatcher("registration.jsp").forward(request, response);
        }
        
    }

}
