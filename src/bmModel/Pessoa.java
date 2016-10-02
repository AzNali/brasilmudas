/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmModel;

import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author az
 */
public abstract class Pessoa {
    
    Statement stmt;

    Pessoa(Statement stmt) {
        this.stmt = stmt;
    }
 
    public abstract boolean SalvarPessoa(ArrayList<String> A);
    
    private int Num;
    
    private ArrayList<Integer> ID = new ArrayList();
    private ArrayList<String> Nome = new ArrayList();
    private ArrayList<Integer> Telefone = new ArrayList();
    private ArrayList<Integer> Celular = new ArrayList();
    private ArrayList<String> Empresa = new ArrayList();
    private ArrayList<String> Cidade = new ArrayList();
    private ArrayList<String> Estado = new ArrayList();
    private ArrayList<Integer> CEP = new ArrayList();
    private ArrayList<String> Rua = new ArrayList();
    private ArrayList<String> Complemento = new ArrayList();
    private ArrayList<String> Email = new ArrayList();

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public ArrayList<Integer> getID() {
        return ID;
    }

    public void setID(ArrayList<Integer> ID) {
        this.ID = ID;
    }

    public ArrayList<String> getNome() {
        return Nome;
    }

    public void setNome(ArrayList<String> Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Integer> getTelefone() {
        return Telefone;
    }

    public void setTelefone(ArrayList<Integer> Telefone) {
        this.Telefone = Telefone;
    }

    public ArrayList<Integer> getCelular() {
        return Celular;
    }

    public void setCelular(ArrayList<Integer> Celular) {
        this.Celular = Celular;
    }

    public ArrayList<String> getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(ArrayList<String> Empresa) {
        this.Empresa = Empresa;
    }

    public ArrayList<String> getCidade() {
        return Cidade;
    }

    public void setCidade(ArrayList<String> Cidade) {
        this.Cidade = Cidade;
    }

    public ArrayList<String> getEstado() {
        return Estado;
    }

    public void setEstado(ArrayList<String> Estado) {
        this.Estado = Estado;
    }

    public ArrayList<Integer> getCEP() {
        return CEP;
    }

    public void setCEP(ArrayList<Integer> CEP) {
        this.CEP = CEP;
    }

    public ArrayList<String> getRua() {
        return Rua;
    }

    public void setRua(ArrayList<String> Rua) {
        this.Rua = Rua;
    }

    public ArrayList<String> getComplemento() {
        return Complemento;
    }

    public void setComplemento(ArrayList<String> Complemento) {
        this.Complemento = Complemento;
    }

    public ArrayList<String> getEmail() {
        return Email;
    }

    public void setEmail(ArrayList<String> Email) {
        this.Email = Email;
    }

}
