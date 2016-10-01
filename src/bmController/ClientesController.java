/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import bmModel.ClienteData;
import bmView.Menu;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;

/**
 *
 * @author az
 */
public class ClientesController{
    Menu Menu;
    ArrayList<String> A;
      
    public ClienteData ClienteData;

    ClientesController(Menu Menu) {
        this.Menu = Menu;
        
    }
    
    public void ClientesCriar(){
        if(ClienteData == null)
            ClienteData = new ClienteData();
            
    }
    
    public void ClientesDisplay() {
        Menu.ViewMenu();
        ClienteData.BuscarData(ClienteData);
        Menu.PreencherCamposMenuClientes(ClienteData);
    }
    
    public void SalvarCliente(){
        if(A == null) {
            A = new ArrayList<>();
        }
        else if(!A.isEmpty()){
            A.clear();
        }
        
        Menu.SClientes(A);
        
        ClienteData.getNome().add(A.get(0));
        ClienteData.getTelefone().add(parseInt(A.get(1)));
        ClienteData.getCelular().add(parseInt(A.get(2)));
        ClienteData.getEmpresa().add(A.get(3));
        ClienteData.getCidade().add(A.get(4));
        ClienteData.getEstado().add(A.get(5));
        ClienteData.getCEP().add(parseInt(A.get(6)));
        ClienteData.getRua().add(A.get(7));
        ClienteData.getComplemento().add(A.get(8));
        ClienteData.getEmail().add(A.get(9));
        
        if (ClienteData.SalvarPessoa(ClienteData,(ClienteData.getNum()))) {
            Menu.Mensagens("Cliente salvo com sucesso.");
        } else {
            Menu.Mensagens("Erro ao salvar cliente.");
        }
    }
    public void Avancar(){
        Menu.Avancar();
        Menu.PreencherCamposMenuClientes(ClienteData);
    }
    public void Voltar(){
        Menu.PreencherCamposMenuClientes(ClienteData);
    }


}
