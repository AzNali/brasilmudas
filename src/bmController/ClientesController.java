/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import bmModel.ClienteData;
import bmModel.Database;
import bmView.Menu;
import java.util.ArrayList;

/**
 *
 * @author az
 */
public class ClientesController{
    Menu Menu;
    ArrayList<String> A;
    
    private Database MysqlCon;
    public ClienteData ClienteData;

    ClientesController(Menu Menu) {
        this.Menu = Menu;
        
    }

    protected void addCon(Database MysqlCon) {
        this.MysqlCon = (Database) MysqlCon;

    }
    
    protected void ClientesCriar(){
        if(ClienteData == null)
            ClienteData = new ClienteData (MysqlCon.Acesso());
            
    }
    
    protected void ClientesDisplay() {
        Menu.ViewMenu();
        ClienteData.BuscarData(ClienteData);
        Menu.PreencherCamposMenuClientes(ClienteData);
    }
    
    protected void SalvarCliente(){
        if(A == null) {
            A = new ArrayList<>();
        }
        else if(!A.isEmpty()){
            A.clear();
        }
        
        if(Menu.SClientes(A)){
            if (ClienteData.SalvarPessoa(A)) {
                Menu.Mensagens("Cliente salvo com sucesso.");
                ClientesDisplay();
            } else {
                Menu.Mensagens("Erro ao salvar cliente.");
            }
        }
        else{    
            Menu.DisplayJPanelNovoCliente();
        }
    }
    
    protected void Avancar(){
        Menu.Avancar();
        Menu.PreencherCamposMenuClientes(ClienteData);
    }
    
    protected void Voltar(){
        Menu.Voltar();
        Menu.PreencherCamposMenuClientes(ClienteData);
    }
    
    protected void jComboBox1(){
        int Index = Menu.getSelectedIndex(1);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 1.");
                break;
        }
    }
    protected void jComboBox2(){
        int Index = Menu.getSelectedIndex(2);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +1)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 2.");
                break;
        }
    }
    protected void jComboBox3(){
        int Index = Menu.getSelectedIndex(3);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +2)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 3.");
                break;
        }
    }
    protected void jComboBox4(){
        int Index = Menu.getSelectedIndex(4);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +3)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 4.");
                break;
        }
    }
    protected void jComboBox5(){
        int Index = Menu.getSelectedIndex(5);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +4)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 5.");
                break;
        }
    }
    protected void jComboBox6(){
        int Index = Menu.getSelectedIndex(6);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +5)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 6.");
                break;
        }
    }
    protected void jComboBox7(){
        int Index = Menu.getSelectedIndex(7);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +6)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 7.");
                break;
        }
    }
    protected void jComboBox8(){
        int Index = Menu.getSelectedIndex(8);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +7)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 8.");
                break;
        }
    }
    protected void jComboBox9(){
        int Index = Menu.getSelectedIndex(9);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +8)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 9.");
                break;
        }
    }
    protected void jComboBox10(){
        int Index = Menu.getSelectedIndex(10);
        switch (Index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (ClienteData.Excluir(ClienteData, Menu.i +9)) {     
                    Menu.Mensagens("Contato excluido com sucesso.");
                    ClientesDisplay();
                }
                break;
            default:
                Menu.Mensagens("Erro ao selecionar item do ComboBox 10.");
                break;
        }
    }


}
