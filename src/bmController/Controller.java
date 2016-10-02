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
        
            case "ComboBox1":
                ClientesController.jComboBox1();
                break;
            case "ComboBox2":
                ClientesController.jComboBox2();
                break;
            case "ComboBox3":
                ClientesController.jComboBox3();
                break;
            case "ComboBox4":
                ClientesController.jComboBox4();
                break;
            case "ComboBox5":
                ClientesController.jComboBox5();
                break;
            case "ComboBox6":
                ClientesController.jComboBox6();
                break;
            case "ComboBox7":
                ClientesController.jComboBox7();
                break;
            case "ComboBox8":
                ClientesController.jComboBox8();
                break;
            case "ComboBox9":
                ClientesController.jComboBox9();
                break;
            case "ComboBox10":
                
                ClientesController.jComboBox10();
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
