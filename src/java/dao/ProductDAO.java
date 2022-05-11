/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBUtility;

/**
 *
 * @author HAITHANH
 */
public class ProductDAO {
    public List<Product> getAllProducts(){
        List<Product> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        con = DBUtility.openConnection();
        try {
            pstmt = con.prepareStatement("select * from tblProduct");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setProId(rs.getInt("ProId"));
                p.setProName(rs.getString("ProName"));
                p.setProducer(rs.getString("Producer"));
                p.setYearMaking(rs.getInt("YearMaking"));
                p.setPrice(rs.getFloat("Price"));
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(con, pstmt, rs);
        }
        return list;
    }
    public Product getProductById(int proId){
        Product p = null;
        Connection con;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        con = DBUtility.openConnection();
        try {
            pstmt = con.prepareStatement("select * from tblProduct where ProId=?");
            pstmt.setInt(1, proId);
            rs = pstmt.executeQuery();
            if(rs.next()){
                p = new Product();
                p.setProId(rs.getInt("ProId"));
                p.setProName(rs.getString("ProName"));
                p.setProducer(rs.getString("Producer"));
                p.setYearMaking(rs.getInt("YearMaking"));
                p.setPrice(rs.getFloat("Price"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(con, pstmt, rs);
        }
        return p;
    }
    
    public boolean addProduct(Product pro){
        boolean bl = false;
        Connection con;
        PreparedStatement pstmt = null;
        
        con = DBUtility.openConnection();
        try {
            pstmt = con.prepareStatement("insert into tblProduct values (?,?,?,?)");
            pstmt.setString(1, pro.getProName());
            pstmt.setString(2, pro.getProducer());            
            pstmt.setInt(3, pro.getYearMaking());
            pstmt.setFloat(4, pro.getPrice());
            int i = pstmt.executeUpdate();
            if(i>0){
                bl = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(con, pstmt, null);
        }
        return bl;
    }
    public boolean updateProduct(Product pro){
        boolean bl = false;
        Connection con;
        PreparedStatement pstmt = null;
        
        con = DBUtility.openConnection();
        try {
            pstmt = con.prepareStatement("update tblProduct set ProName=?, Producer=?, YearMaking=?, Price=? where ProId=?");
            pstmt.setString(1, pro.getProName());
            pstmt.setString(2, pro.getProducer());            
            pstmt.setInt(3, pro.getYearMaking());
            pstmt.setFloat(4, pro.getPrice());
            pstmt.setFloat(5, pro.getProId());
            int i = pstmt.executeUpdate();
            if(i>0){
                bl = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(con, pstmt, null);
        }
        return bl;
    }
    public boolean deleteProduct(int proId){
        boolean bl = false;
        Connection con;
        PreparedStatement pstmt = null;
        
        con = DBUtility.openConnection();
        try {
            pstmt = con.prepareStatement("delete from tblProduct where ProId=?");
            pstmt.setInt(1, proId);
            int i = pstmt.executeUpdate();
            if(i>0){
                bl = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBUtility.closeAll(con, pstmt, null);
        }
        return bl;
    }
}
