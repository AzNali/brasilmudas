/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author az
 */
public class Database {

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void InicializarMysql() {
        
    }

    public Statement Acesso() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasilmudas?useSSL=false", "root", "surf112820");
            Statement stmt = (Statement) con.createStatement();
            return stmt;

        } catch (ClassNotFoundException | SQLException E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);

        }
        return null;
    }
}
