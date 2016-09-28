/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import bmModel.ClienteData;
import bmView.Menu;

/**
 *
 * @author az
 */
public class ClientesController{
    Menu Menu;
      
    public ClienteData ClienteData;

    ClientesController(Menu Menu) {
        this.Menu = Menu;
        
    }
    
    public void ClientesCriar(){
        if(ClienteData == null)
            ClienteData = new ClienteData();
            
    }
    
    public void ClientesDisplay() {
        ClienteData.BuscarData(ClienteData);
        Menu.PreencherCampos(ClienteData, Menu.i);
    }


}
