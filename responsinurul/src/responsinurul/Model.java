/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsinurul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Model {
    String DBurl = "jdbc:mysql://localhost/barang";
    String DBUsername = "root";
    String DBPassword = "";
    Connection koneksi;
    Statement statement;
    
    public Model(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
               koneksi = (Connection) DriverManager.getConnection(DBurl, DBUsername, DBPassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
        }
    }
        public String[][] BarangList(){
         
        try{
            int jmlData = 0;
        
        String data[][] = new String[getBanyakData()][5];
        
          String query = "Select * from barang"; 
          ResultSet resultSet = statement.executeQuery(query);
         while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("Id");
                data[jmlData][1] = resultSet.getString("Nama");                
                data[jmlData][2] = resultSet.getString("Massa");
                data[jmlData][3] = resultSet.getString("Harga");
            
                jmlData++;
        }  
        return data;
    
    }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

     public void insertbarang(String id, String nama, String massa, String harga){
     int jmlData = 0;
     double fnama = Float.parseFloat(nama);
     double fmassa = Float.parseFloat(massa);
     double harga = (fnama +fmassa)/3;
        try {
           String query = "Select * from movie WHERE judul = '" + Id + "' "; 
           System.out.println(id + " " + fnama + " " + fmassa + "  + harga);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            return data;
}catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

  public void insertbarang (String id, String nama, String massa, String harga){
     int jmlData = 0;
     double fnama = Float.parseFloat(nama);
     double fmassa = Float.parseFloat(massa);
     double harga = (fnama + fmassa)/2;
        try {
           String query = "Select * from movie WHERE judul = '" + id + "' "; 
           System.out.println(id + " " + fnama + " " + fmassa  + " " + harga);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
                 
            if (jmlData == 0) {
                query = "INSERT INTO movie VALUES('"+id+"','"+fnama+"','"+fmassa+"','"+harga+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query);
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Barang Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Barang sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    
}

 public void updatebarang (String id, String nama, String massa){
        int jmlData = 0;
        double falur = Float.parseFloat(nama);
        double fpenokohan = Float.parseFloat(massa);
        double nilai = (fnama + fmassa)/2;
        try {
           String query = "Select * from movie WHERE judul= '" + id "' "; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData == 1) {
                
                query = "UPDATE movie SET alur='" + falur + "', penokohan='" + fpenokohan + "', nilai='" + nilai + "', akting = '" "' WHERE Id="+ Id"'";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from barang';
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

public void deletebarang (String id){
        try{
        
        }
 public void deleteMovie (String judul) {
        try{
            String query = 'Delete FROM barang WHERE id = '"+id+"'"
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}