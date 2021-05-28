package goodelivery;
import java.sql.*;
public class koneksimysql {
    private static Connection koneksimysql;
    public static Connection koneksiDB() {
        if (koneksimysql==null){
            try {
                String DB="jdbc:mysql://localhost:3306/godelivery"; // nama database
                String user="root"; // user database
                String pass="ArlanBB270899"; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksimysql = DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksimysql;
    }
    
}
