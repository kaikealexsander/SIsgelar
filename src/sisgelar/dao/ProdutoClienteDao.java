/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgelar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sisgelar.model.ProdutoCliente;

/**
 *
 * @author kaikealexsander
 */
public class ProdutoClienteDao extends Conexao{
    private PreparedStatement ps;
    private ResultSet rs;
    
    public boolean inserir(ProdutoCliente p){
        try {
            query = "insert into tb_ProdCliente values(0,?,?,?,?,?)";
                ps = con.prepareStatement(query);
                ps.setInt(1, p.getIdCliente());
                ps.setString(1, p.getMarca());
                ps.setString(2, p.getPotencia());
                ps.setString(3, p.getVoltagem());
                ps.setString(4, p.getModelo());
                ps.setString(5, p.getLocalizacao());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados na tabela ProdCLientes! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean excluir(ProdutoCliente p){
        try {
            query = "delete from tb_ProdCliente where idProdCliente=?";
                ps = con.prepareStatement(query);
                ps.setInt(1, p.getIdProdCliente());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir dados na tabela ProdCLientes! \n"+e);
            e.printStackTrace();
        }
        return false;
    }

    public boolean alterar(ProdutoCliente p){
        try {
            query = "update tb_ProdCliente set idCliente=?, marca=?, potencia=?, voltagem=?, modelo=?, localizacao=? where idProdCliente=?";
                ps = con.prepareStatement(query);
                ps.setInt(1, p.getIdCliente());
                ps.setString(2, p.getMarca());
                ps.setString(3, p.getPotencia());
                ps.setString(4, p.getVoltagem());
                ps.setString(5, p.getModelo());
                ps.setString(6, p.getLocalizacao());
                ps.setInt(7, p.getIdProdCliente());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar dados na tabela ProdCliente! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public List<ProdutoCliente> buscar(ProdutoCliente p){
        return new ArrayList<ProdutoCliente>();
    }

    public List<ProdutoCliente> buscar(String t) {
               List<ProdutoCliente> lista = new ArrayList<ProdutoCliente>();
       try {
                query = "select * from tb_ProdCliente WHERE marca like concat('%',?,'%') order by idProdCliente";
                    ps = con.prepareStatement(query);
                    ps.setString(1, t);
               rs = ps.executeQuery();
               while (rs.next())
                    lista.add(new ProdutoCliente(
                            rs.getInt("idProdCliente"),
                            rs.getInt("idCliente"),
                            rs.getString("marca"),
                            rs.getString("potencia"),
                            rs.getString("voltagem"),
                            rs.getString("modelo"),
                            rs.getString("localizacao")
                    ));
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela ProdCliente! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
    
    public List<ProdutoCliente> buscar(int t) {
               List<ProdutoCliente> lista = new ArrayList<ProdutoCliente>();
       try {
            query = "select * from tb_ProdCliente where marca = ? order by marca";
                ps = con.prepareStatement(query);
                ps.setInt(1, t);
           rs = ps.executeQuery();
            while (rs.next())
                lista.add(new ProdutoCliente(
                        rs.getInt("idProdCliente"),
                        rs.getInt("idCliente"),
                        rs.getString("marca"),
                        rs.getString("potencia"),
                        rs.getString("voltagem"),
                        rs.getString("modelo"),
                        rs.getString("localizacao")
                ));
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela ProdCliente! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
}