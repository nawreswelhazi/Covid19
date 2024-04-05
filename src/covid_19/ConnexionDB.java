/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author msi
 */
public class ConnexionDB {
    
   private Connection conn;

  
   private Statement stmt;

    public Connection getConn() {
        return conn;
    }

    public Statement getStmt() {
        return stmt;
    }
   
    public ConnexionDB(){
try {
Class.forName("oracle.jdbc.driver.OracleDriver");

conn = DriverManager.getConnection ("jdbc:oracle:thin:projet/projet@localhost");

stmt = conn.createStatement();
/*
rs = stmt.executeQuery("SELECT * FROM users");

    
while(rs.next()) {
System.out.print(rs.getInt(1) +"\n");
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
System.out.println(rs.getString(4));

System.out.println(rs.getString(5));
}
 rs.close();  stmt.close(); con.close();*/
}
catch (ClassNotFoundException e) { e.printStackTrace(); }
 catch (SQLException e) { e.printStackTrace();
     }
}
    public void connecter(){
   
    }
    
 
}