/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowseat;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayeed
 */
public class DB{
    
    /**
     * Connect with database
     * Supports MySql and SqLite Database
     * @return Connection
     */
    public static Connection connect(){
        try{
//////////////////////////////////////////////////////////////Using mySQL////////////////////////////////////////////////////////
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
//////////////////////////////////////////////////////////////Using SQlite///////////////////////////////////////////////////////
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:bus.sqlite");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error: In DB Class connect "+e);
            return null;
        }
    }
}
