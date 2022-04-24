
package tugaslogandreg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {
     String dbUrl = "jdbc:mysql://localhost/tugasjdbc";
    String dbUsername = "root";
    String dbPassword = "";
    static final String driver = "com.mysql.cj.jdbc.Driver";
    Connection konek;
    Statement statement;

    public koneksi() {
        try{
            Class.forName(driver);
            konek=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }

    
}
