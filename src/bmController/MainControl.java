/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmController;

import bmView.Menu;

/**
 *
 * @author az
 */
public class MainControl {

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }


    private String teste;
    private static Menu Menu;
    
    public static void main(String[] args){
        Menu = new Menu(); 
        
    }
}
