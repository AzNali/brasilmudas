/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import bmView.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author az
 */
public class MainControl extends Controller implements ActionListener {

    //private Menu Menu;
    public static void main(String[] args) {
        Menu Menu = new Menu();

        Controller control = new Controller();
        Menu.addControler(control);
    }
}
