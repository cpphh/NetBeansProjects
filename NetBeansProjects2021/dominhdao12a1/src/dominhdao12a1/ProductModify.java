/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominhdao12a1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CRUD (insert, update, delete, findAll)
 * @author Diep.Tran
 */
public class ProductModify {
    public static List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management", "root", "");
            
            //query
            String sql = "select * from product";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Product std = new Product(resultSet.getInt("id"), 
                        resultSet.getString("tensp"), resultSet.getString("hangsx"), 
                        resultSet.getString("ngaynhap"), resultSet.getString("giaban"), 
                        resultSet.getInt("soluong"));
                productList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return productList;
    }
    public static void insert(Product std) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management", "root", "");
            
            //query
            String sql = "insert into product(tensp, hangsx, soluong, ngaynhap, giaban) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getTensp());
            statement.setString(2, std.getHangsx());
            statement.setInt(3, std.getSoluong());
            statement.setString(4, std.getNgaynhap());
            statement.setString(5, std.getGiaban());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    

    public static void update(Product std) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management", "root", "");
            
            //query
            String sql = "update product set tensp=?,hangsx=?,soluong=?,ngaynhap=?,giaban=? where id = ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getTensp());
            statement.setString(2, std.getHangsx());
            statement.setInt(3, std.getSoluong());
            statement.setString(4, std.getNgaynhap());
            statement.setString(5, std.getGiaban());
            statement.setInt(6, std.getId());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
     public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management", "root", "");
            
            //query
            String sql = "delete from product where id = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
       public static List<Product> findByTensp(String tensp) {
        List<Product> productList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management", "root", "");
            
            //query
            String sql = "select * from product where tensp like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+tensp+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Product std = new Product(resultSet.getInt("id"), 
                        resultSet.getString("tensp"), resultSet.getString("hangsx"), 
                        resultSet.getString("ngaynhap"), resultSet.getString("giaban"), 
                        resultSet.getInt("soluong"));
                productList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return productList;
    }
}
    
