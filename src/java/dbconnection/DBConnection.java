/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.*;

public class DBConnection {
    
    private Statement stm;
    private Connection con;
    
    public DBConnection()
    {
        try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/mitu","mitu","mitu");
            stm = con.createStatement();
            
            System.out.println("Connection success.............");
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Statement getStm() {
        return stm;
    }
    
   
}
