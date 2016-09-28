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

    Statement stmt = Acesso();

    public boolean SalvarPessoa(Database Data) {
        try {
            String Insert = "INSERT INTO Clientes(Nome, Telefone, Celular, Empresa, Cidade, Estado, CEP, Rua, Complemento, Email) Values('" + Data.getNome().get(0) + "','" + Data.getTelefone().get(0) + "','" + Data.getCelular().get(0) + "','" + Data.getEmpresa().get(0) + "','" + Data.getCidade().get(0) + "','" + Data.getEstado().get(0) + "','" + Data.getCEP().get(0) + "','" + Data.getRua().get(0) + "','" + Data.getComplemento().get(0) + "','" + Data.getEmail().get(0) + "');";
            System.out.println(Insert);
            stmt.executeUpdate(Insert);

            return true;

        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
        }

        return false;
    }

    public boolean BuscarData(Database Data) {
        if (!Data.getNome().isEmpty()) {
            Data.getID().clear();
            Data.getNome().clear();
            Data.getTelefone().clear();
            Data.getCelular().clear();
            Data.getEmpresa().clear();
            Data.getCidade().clear();
            Data.getEstado().clear();
            Data.getCEP().clear();
            Data.getRua().clear();
            Data.getComplemento().clear();
            Data.getEmail().clear();
        }

        try {
            String Pesquisar = "SELECT * FROM Clientes;";
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM Clientes;");
            rs.next();
            Data.setNum((rs.getInt(1)));

            rs = stmt.executeQuery(Pesquisar);

            if (rs.next()) {
                Data.getNome().add(rs.getString("Nome"));
                Data.getTelefone().add(rs.getString("Telefone"));
                Data.getID().add(rs.getInt("ID"));
                Data.getCelular().add(rs.getInt("Telefone"));
                Data.getEmpresa().add(rs.getString("Nome"));
                Data.getCidade().add(rs.getString("ID"));
                Data.getEstado().add(rs.getString("Nome"));
                Data.getCEP().add(rs.getInt("Telefone"));
                Data.getRua().add(rs.getString("ID"));
                Data.getComplemento().add(rs.getString("Nome"));
                Data.getEmail().add(rs.getString("Nome"));
                while (rs.next()) {
                    Data.getNome().add(rs.getString("Nome"));
                    Data.getTelefone().add(rs.getString("Telefone"));
                    Data.getID().add(rs.getInt("ID"));
                    Data.getCelular().add(rs.getInt("Telefone"));
                    Data.getEmpresa().add(rs.getString("Nome"));
                    Data.getCidade().add(rs.getString("ID"));
                    Data.getEstado().add(rs.getString("Nome"));
                    Data.getCEP().add(rs.getInt("Telefone"));
                    Data.getRua().add(rs.getString("ID"));
                    Data.getComplemento().add(rs.getString("Nome"));
                    Data.getEmail().add(rs.getString("Nome"));

                }
                return true;
            }
            return false;
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return false;
        }
    }

    public int ProcurarPosicao(Database Data, int i) {
        int Pos;
        try {
            String GetPosicao = "SELECT COUNT(*) FROM Clientes WHERE ID <= '" + Data.getID().get(i) + "'";
            ResultSet rs = stmt.executeQuery(GetPosicao);
            Pos = rs.getInt(1);
            return Pos;
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage(), "Erro:", 1);
            return -1;
        }
    }

    public boolean Excluir(Database Data, int i) {
        try {
            String Excluir = "DELETE FROM Clientes WHERE ID='" + Data.getID().get(i) + "';";
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
