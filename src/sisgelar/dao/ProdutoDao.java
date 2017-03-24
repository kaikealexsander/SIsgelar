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
import sisgelar.model.Produto;

/**
 *
 * @author kaikealexsander
 */
public class ProdutoDao extends Conexao{
 //SELECT `idProdCliente`, `idCliente`, `marca`, `potencia`, `voltagem`, `modelo`, `localizacao` FROM `tb_Produtos` WHERE 1   
    
    private PreparedStatement ps;
    private ResultSet rs;
    
    public boolean inserir(Produto p){
        try {
            query = "insert into tb_Produtos values(0,?,?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(query);
            ps.setInt(1, p.getCodProd());
            ps.setString(1, p.getProduto());
            ps.setString(2, p.getDescricao());
            ps.setDouble(3, p.getValorUnitario());
            ps.setInt(4, p.getCodCategoria());
            ps.setInt(5, p.getQtdMinima());
            ps.setInt(6, p.getQtdAtual());
            ps.setDouble(7, p.getLucro());
            ps.setBytes(8, p.getImagem());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados na tabela ProdCLientes! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean excluir(Produto p){
        try {
            query = "delete from tb_Produtos where idProdCliente=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, p.getCodProd());
            
            if (ps.executeUpdate() > 0)
                return true;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir dados na tabela Produtos! \n"+e);
            e.printStackTrace();
        }
        return false;
    }

    public boolean alterar(Produto p){
        try {
//UPDATE `tb_Produtos` SET `idProdCliente`=[value-1],`idCliente`=[value-2],`marca`=[value-3],`potencia`=[value-4],
//`voltagem`=[value-5],`modelo`=[value-6],`localizacao`=[value-7] WHERE 1
            query = "UPDATE tb_Produtos SET produto=?,descricao=?,"
             + "valorUnitario=?,codCategoria=?,qtdMinima=?,"
             + "qtdAtual=?,lucro=?,imagem=? WHERE idProduto=?";
            ps = con.prepareStatement(query);
            ps.setString(1, p.getProduto());
            ps.setString(2, p.getDescricao());
            ps.setDouble(3, p.getValorUnitario());
            ps.setInt(4, p.getCodCategoria());
            ps.setInt(5, p.getQtdMinima());
            ps.setInt(6, p.getQtdAtual());
            ps.setDouble(7, p.getLucro());
            ps.setBytes(8, p.getImagem());
            
            if (ps.executeUpdate() > 0)
                return true;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar dados na tabela Produtos! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Produto> buscar(Produto p){
        return new ArrayList<Produto>();
    }

    public List<Produto> buscar(String t) {
               List<Produto> lista = new ArrayList<Produto>();
       try {
//SELECT `idProduto`, `produto`, `descricao`, `valorUnitario`, `codCategoria`, `qtdMinima`, `qtdAtual`, `lucro`, `imagem` FROM `tb_Produtos` WHERE 1
           
            query = "select * from tb_Produtos WHERE produto like concat('%',?,'%') order by idProduto";
            ps = con.prepareStatement(query);
            ps.setString(1, t);
            rs = ps.executeQuery();
            while (rs.next())
                lista.add(new Produto(
                        rs.getInt("idProduto"),
                        rs.getString("produto"),
                        rs.getString("descricao"),
                        rs.getDouble("valorUnitario"),
                        rs.getInt("codCategoria"),
                        rs.getInt("qtdMinima"),
                        rs.getInt("qtdAtual"),
                        rs.getDouble("lucro"),
                        rs.getBytes("imagem")
                ));
            
       ////SELECT `idProdCliente`, `idCliente`, `marca`, `potencia`, `voltagem`, `modelo`, `localizacao` FROM `tb_Produtos` WHERE 1   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela Produto! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
    
    public List<Produto> buscar(int t) {
               List<Produto> lista = new ArrayList<Produto>();
       try {
            query = "select * from tb_Produtos where produto = ? order by idProduto";
            ps = con.prepareStatement(query);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            while (rs.next())
                lista.add(new Produto(
                        rs.getInt("idProduto"),
                        rs.getString("produto"),
                        rs.getString("descricao"),
                        rs.getDouble("valorUnitario"),
                        rs.getInt("codCategoria"),
                        rs.getInt("qtdMinima"),
                        rs.getInt("qtdAtual"),
                        rs.getDouble("lucro"),
                        rs.getBytes("imagem")
                ));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela Produto! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
}