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
//Classe responsável pelo controle do direcionamento dos eventos ocorridos no View para as respectivas classes de processamento desses eventos.
public class Controller implements ActionListener {

    ClientesController ClientesController;
    Menu Menu;
khgjhygkjg
    Controller() {
        Menu Menu = new Menu();
        Controller Control = new Controller();

        Menu.addController(Control);
    }

    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("Clientes".equals(e.getActionCommand())) {
            if (ClientesController == null) {
                ClientesController = new ClientesController(Menu);
            }

            ClientesController.ClientesCriar();
            
            Menu.ViewMenu();
            ClientesController.ClientesDisplay();

            
        }
    }
}
























//    String s = "asd";
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getActionCommand() == "Avançar") {
//            try {
//                
//                Integer.parseInt(s);
//            } catch(NumberFormatException eq)  {
//                System.out.println(eq);
//            }
//        }
//    }
