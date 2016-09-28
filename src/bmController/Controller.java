/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author az
 */
public class Controller implements ActionListener {

    String s = "asd";

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Nome do comando") {
            try {
                
                Integer.parseInt(s);
            } catch(NumberFormatException eq)  {
                System.out.println(eq);
            }
        }
    }
}
