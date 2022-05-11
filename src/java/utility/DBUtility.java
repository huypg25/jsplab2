/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HAITHANH
 */
public class DBUtility {
    public static Connection openConnection(){
        Connection con = null;        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DBLab2","sa","1234@");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs){
        if(con!=null)
            try {
                con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(pstmt!=null)
            try {
                pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(rs!=null)
            try {
                rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
