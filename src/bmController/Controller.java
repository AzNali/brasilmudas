/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import bmModel.Database;
import bmView.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

/**
 *
 * @author Matheus Carvalho Nali e Bruna Yukari Fujii Yoshida
 */
//Classe responsável pelo controle do direcionamento dos eventos ocorridos no View para as respectivas classes de processamento desses eventos.
public class Controller implements ActionListener {
    
    private ClientesController ClientesController;
    private Database MysqlCon;
    private Menu Menu;
   
    public Controller() {
        
    }
    
    public void addView(Menu View){
        this.Menu = (Menu)View;
    }
    
    public void addCon(Database MysqlCon) {
        this.MysqlCon = (Database) MysqlCon;
        
    }
        
    public void startMainWindow(){
        this.Menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
        ////////////////////////////////////////////////////////////////////////
        //Botões do Menu
            case "Menu":
                break;
        
            case "Clientes":

                if (ClientesController == null) {
                    ClientesController = new ClientesController(Menu);
                    ClientesController.addCon(MysqlCon);
                }

                ClientesController.ClientesCriar();
                ClientesController.ClientesDisplay();
                break;
        ////////////////////////////////////////////////////////////////////////
        //Botões Menu Cliente.
            case "Novo Cliente":
                Menu.DisplayJPanelNovoCliente();
                break;
            case "Avancar":
                ClientesController.Avancar();
                break;
            
            case "Voltar":
                ClientesController.Voltar();
                break;
        
        //Botões Salvar Cliente 
            case "Salvar":
                ClientesController.SalvarCliente();
                ClientesController.ClientesDisplay();
                break;
            
            case "Cancelar":
                break;
            
            case "FazerLogin":
                
                    
                
            default :
                break;
                
        ////////////////////////////////////////////////////////////////////////
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
