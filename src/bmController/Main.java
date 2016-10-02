/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import bmModel.Database;
import bmView.Menu;
import java.sql.Statement;

/**
 *
 * @author buu
 */
public class Main {
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu Menu = new Menu();
                Controller Control = new Controller();
                Database MysqlCon = new Database();

                Control.addView(Menu);
                Control.addCon(MysqlCon);
                Control.startMainWindow();
                Menu.addController(Control);
            }
        });
    }
    
}