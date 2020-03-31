/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dbconnection.DBConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AppUser;
import model.Question;


/*
APPUSER : create table appuser (email varchar(255) primary key, password varchar(255), name varchar(255), rule varchar(10) default 'STUDENT'  );

 create table QUESTION (id INTEGER NOT NULL 
 PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
 (START WITH 1, INCREMENT BY 1), ques varchar(255), a varchar(255), b varchar(255), c varchar(255), d varchar(225), ans varchar(1));

 */
public class Service {

    private Statement stm;

    public Service() {
        try {
            DBConnection dbc = new DBConnection();
            stm = dbc.getStm();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int loginUser(String email, String password) {

        int bol = 0;
        String sql = "select password,rule from APPUSER where email='" + email + "'";
        try {
            ResultSet rs = stm.executeQuery(sql);
            rs.next();
            String pass = rs.getString(1);
            String rule = rs.getString(2);

            if (password.equals(pass)) {
                if (rule.equalsIgnoreCase("STUDENT")) {
                    bol = 1;
                } else if (rule.equalsIgnoreCase("ADMIN")) {
                    bol = 2;
                }
            } else {
                bol = 0;
            }
            
            System.err.println("RULE : "+rule);
            
        } catch (SQLException ex) {
            bol = 0;
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bol;
    }

    public boolean AppUserRegistration(AppUser appUser) {
        boolean bol = true;
        String sql = "insert into  APPUSER (email, password, name) values ('" + appUser.getEmail() + "','" + appUser.getPasword() + "','" + appUser.getName() + "')";
        try {
            stm.execute(sql);
        } catch (SQLException ex) {
            bol = false;
            System.out.println(ex);
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bol;
    }

    public List<Question> getData() {
        List<Question> dataList = new ArrayList<>();

        String sql = "select * from QUESTION";
        try {
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ques = rs.getString("ques");
                String a = rs.getString("a");
                String b = rs.getString("b");
                String c = rs.getString("c");
                String d = rs.getString("d");
                String ans = rs.getString("ans");

                Question q = new Question(id, ques, a, b, c, d, ans);
                dataList.add(q);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

       // System.out.println("Data : -----------------\n"+dataList.toString());
        return dataList;
    }

    
    public List<Question> getExamQuestionSet(int n)
    {
        List<Question> data = getData();
        List<Question> quesList = new ArrayList<>();
        
        if(n<=data.size())
        {
            while(n!=0){
                
                int dataLen = data.size();
                int i = (int) (Math.random()*dataLen);
                quesList.add(data.get(i));
                data.remove(i);
                
                n--;
            }
            
        }
        
       
        return quesList;
    }
    
    
    
    public void addQuestion(Question q) {
        
        String sql = "insert into QUESTION (ques, a, b, c, d, ans) values('" + q.getQues() + "','" + q.getA() + "','" + q.getB() + "','" + q.getC() + "','" + q.getD() + "','" + q.getAns() + "')";
        try {
            stm.execute(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void deleteQuestion(int id) {
        String sql = "delete from QUESTION where id = " + id;
        try {
            stm.execute(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
   
    
    
    
    

}
