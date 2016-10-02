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

/**
 *
 * @author az
 */
public class ClienteData extends Pessoa {

    public ClienteData(Statement stmt) {
        super(stmt);
    }

    
    public boolean SalvarPessoa(ArrayList<String> A) {
        try {
                    
            String Insert = "INSERT INTO Clientes(Nome, Telefone, Celular, Empresa, Cidade, Estado, CEP, Rua, Complemento, Email) Values('"+ A.get(0) + "'," +A.get(1) + "," + A.get(2) + ",'" + A.get(3) + "','" + A.get(4) + "','" + A.get(5) + "'," + A.get(6) + ",'" + A.get(7) + "','" +A.get(8) + "','" + A.get(9) +"');";

            stmt.executeUpdate(Insert);

            return true;

        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
        }

        return false;
    }

    public boolean BuscarData(Pessoa Pessoa) {
        if (!Pessoa.getNome().isEmpty()) {
            Pessoa.getID().clear();
            Pessoa.getNome().clear();
            Pessoa.getTelefone().clear();
            Pessoa.getCelular().clear();
            Pessoa.getEmpresa().clear();
            Pessoa.getCidade().clear();
            Pessoa.getEstado().clear();
            Pessoa.getCEP().clear();
            Pessoa.getRua().clear();
            Pessoa.getComplemento().clear();
            Pessoa.getEmail().clear();
        }

        try {
            String Pesquisar = "SELECT * FROM Clientes;";
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM Clientes;");
            rs.next();
            Pessoa.setNum((rs.getInt(1)));

            rs = stmt.executeQuery(Pesquisar);

            if (rs.next()) {
                Pessoa.getNome().add(rs.getString("Nome"));
                Pessoa.getTelefone().add(rs.getInt("Telefone"));
                Pessoa.getID().add(rs.getInt("ID"));
                Pessoa.getCelular().add(rs.getInt("Celular"));
                Pessoa.getEmpresa().add(rs.getString("Empresa"));
                Pessoa.getCidade().add(rs.getString("Cidade"));
                Pessoa.getEstado().add(rs.getString("Estado"));
                Pessoa.getCEP().add(rs.getInt("CEP"));
                Pessoa.getRua().add(rs.getString("Rua"));
                Pessoa.getComplemento().add(rs.getString("Complemento"));
                Pessoa.getEmail().add(rs.getString("Email"));
                while (rs.next()) {
                    Pessoa.getNome().add(rs.getString("Nome"));
                    Pessoa.getTelefone().add(rs.getInt("Telefone"));
                    Pessoa.getID().add(rs.getInt("ID"));
                    Pessoa.getCelular().add(rs.getInt("Celular"));
                    Pessoa.getEmpresa().add(rs.getString("Empresa"));
                    Pessoa.getCidade().add(rs.getString("Cidade"));
                    Pessoa.getEstado().add(rs.getString("Estado"));
                    Pessoa.getCEP().add(rs.getInt("CEP"));
                    Pessoa.getRua().add(rs.getString("Rua"));
                    Pessoa.getComplemento().add(rs.getString("Complemento"));
                    Pessoa.getEmail().add(rs.getString("Email"));

                }
                return true;
            }
            return false;
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return false;
        }
    }

    public int ProcurarPosicao(Pessoa Pessoa, int i) {
        int Pos;
        try {
            String GetPosicao = "SELECT COUNT(*) FROM Clientes WHERE ID <= '" + Pessoa.getID().get(i) + "'";
            ResultSet rs = stmt.executeQuery(GetPosicao);
            Pos = rs.getInt(1);
            return Pos;
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return -1;
        }
    }

    public boolean Excluir(Pessoa Pessoa, int i) {
        try {
            String Excluir = "DELETE FROM Clientes WHERE ID='" + Pessoa.getID().get(i) + "';";
            stmt.execute(Excluir);
            return true;

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return false;
        }
    }

    /* public static class NumClientes {

        public int getNum() {
            return Num;
        }

        public void setNum(int Num) {
            this.Num = Num;
        }

        private int Num;
    }*/
}
