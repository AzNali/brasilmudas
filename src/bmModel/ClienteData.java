/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//oii bruna
/**
 *
 * @author az
 */
public class ClienteData extends Database {

    Statement stmt = Acesso();
    
    public ArrayList<Integer> ID = new ArrayList();
    public ArrayList<String> Nome = new ArrayList();
    public ArrayList<String> Telefone = new ArrayList();
    public ArrayList<Integer> Celular = new ArrayList();
    public ArrayList<String> Empresa = new ArrayList();
    public ArrayList<String> Cidade = new ArrayList();
    public ArrayList<String> Estado = new ArrayList();
    public ArrayList<Integer> CEP = new ArrayList();
    public ArrayList<String> Rua = new ArrayList();
    public ArrayList<String> Complemento = new ArrayList();
    public ArrayList<String> Email = new ArrayList();    
    
    public boolean SalvarCliente(ClienteData ClienteData) {
        try {
            String Insert = "INSERT INTO Clientes(Nome, Telefone, Celular, Empresa, Cidade, Estado, CEP, Rua, Complemento, Email) Values('"+ClienteData.Nome.get(0)+"','"+ClienteData.Telefone.get(0)+"','"+ClienteData.Celular.get(0)+"','"+ClienteData.Empresa.get(0)+"','"+ClienteData.Cidade.get(0)+"','"+ClienteData.Estado.get(0)+"','"+ClienteData.CEP.get(0)+"','"+ClienteData.Rua.get(0)+"','"+ClienteData.Complemento.get(0)+"','"+ClienteData.Email.get(0)+"');";
            System.out.println(Insert);
            stmt.executeUpdate(Insert);

            return true;

        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
        }

        return false;
    }

    public boolean BuscarData(ClienteData ClienteData, NumClientes NumClientes) {
        if(!ClienteData.Nome.isEmpty()){
            ClienteData.ID.clear();
            ClienteData.Nome.clear();
            ClienteData.Telefone.clear();
            ClienteData.Celular.clear();
            ClienteData.Empresa.clear();
            ClienteData.Cidade.clear();
            ClienteData.Estado.clear();
            ClienteData.CEP.clear();
            ClienteData.Rua.clear();
            ClienteData.Complemento.clear();    
            ClienteData.Email.clear();
        }
        
        try {
            String Pesquisar = "SELECT * FROM Clientes;";
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM Clientes;");
            rs.next();
            NumClientes.setNum(rs.getInt(1));

            rs = stmt.executeQuery(Pesquisar);
            
            if (rs.next()) {
                ClienteData.Nome.add(rs.getString("Nome"));
                ClienteData.Telefone.add(rs.getString("Telefone"));
                ClienteData.ID.add(rs.getInt("ID"));
                ClienteData.Celular.add(rs.getInt("Telefone"));
                ClienteData.Empresa.add(rs.getString("Nome"));
                ClienteData.Cidade.add(rs.getString("ID"));
                ClienteData.Estado.add(rs.getString("Nome"));
                ClienteData.CEP.add(rs.getInt("Telefone"));
                ClienteData.Rua.add(rs.getString("ID"));
                ClienteData.Complemento.add(rs.getString("Nome"));
                ClienteData.Email.add(rs.getString("Nome"));

                while (rs.next()) {
                    ClienteData.Nome.add(rs.getString("Nome"));
                    ClienteData.Telefone.add(rs.getString("Telefone"));
                    ClienteData.ID.add(rs.getInt("ID"));
                    ClienteData.Celular.add(rs.getInt("Telefone"));
                    ClienteData.Empresa.add(rs.getString("Nome"));       
                    ClienteData.Cidade.add(rs.getString("ID"));
                    ClienteData.Estado.add(rs.getString("Nome"));
                    ClienteData.CEP.add(rs.getInt("Telefone"));
                    ClienteData.Rua.add(rs.getString("ID"));
                    ClienteData.Complemento.add(rs.getString("Nome"));
                    ClienteData.Email.add(rs.getString("Nome"));

                }
                return true;
            }
            return false;
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return false;
        }
    }

    public int ProcurarPosicao(ClienteData ClienteData, int i) {
        int Pos;
        try {
            String GetPosicao = "SELECT COUNT(*) FROM Clientes WHERE ID <= '" + ClienteData.ID.get(i) + "'";
            ResultSet rs = stmt.executeQuery(GetPosicao);
            Pos = rs.getInt(1);
            return Pos;
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return -1;
        }
    }

    public boolean Excluir(ClienteData ClienteData, int i) {
        try {
            String Excluir = "DELETE FROM Clientes WHERE ID='" + ClienteData.ID.get(i) + "';";
            stmt.execute(Excluir);
            return true;

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return false;
        }
    }

    public static class NumClientes {

        public int getNum() {
            return Num;
        }

        public void setNum(int Num) {
            this.Num = Num;
        }

        private int Num;
    }
}

