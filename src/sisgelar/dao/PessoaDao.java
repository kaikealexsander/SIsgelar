package sisgelar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sisgelar.model.Pessoa;

public class PessoaDao extends Conexao{
    private PreparedStatement ps;
    private ResultSet rs;
    //INSERT INTO `tbPessoas`(`idPessoa`, `nome`, `cpf`, `endereco`, 
    //`telefone`, `celular`, `celular2`, `cep`, `email`, `fantasia`) 
    public boolean inserir(Pessoa p){
        try {
            query = "insert into tb_Pessoas values(0,?,?,?,?,?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(query);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getEndereco());
            ps.setString(4, p.getCep());
            ps.setString(5, p.getBairro());
            ps.setString(6, p.getEmail());
            ps.setString(7, p.getTelefone());
            ps.setString(8, p.getCelular());
            ps.setString(9, p.getCelular2());
            ps.setString(10, p.getFantasia());
            ps.setString(11, p.getNumero());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados na tabela pessoas! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean excluir(Pessoa p){
        try {
            query = "delete from tb_Pessoas where idPessoa=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, p.getIdpessoa());
            
            if (ps.executeUpdate() > 0)
                return true;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir dados na tabela pessoas! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    //UPDATE `tb_Pessoas` SET `idPessoa`=[value-1],`nome`=[value-2],`cpf`=[value-3],`endereco`=[value-4],`cep`=[value-5],`bairro`=[value-6]
    //`email`=[value-7],`telefone`=[value-8],`celular`=[value-9],`celular2`=[value-10] WHERE 1
    public boolean alterar(Pessoa p){
        try {
     //UPDATE `tb_Pessoas` SET `idPessoa`=[value-1],`nome`=[value-2],`cpf`=[value-3],`endereco`=[value-4],
     //`cep`=[value-5],`bairro`=[value-6],`email`=[value-7],`telefone`=[value-8],`celular`=[value-9],`celular2`=[value-10] WHERE 1
            query = "update tb_Pessoas set nome=?, cpf=?, endereco=?, cep=?, bairro=?, email=?, telefone=?, "
                    + "celular=?, celular2=?, fantasia=?, numero=? where idPessoa=?";
            ps = con.prepareStatement(query);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getEndereco());
            ps.setString(4, p.getCep());
            ps.setString(5, p.getBairro());
            ps.setString(6, p.getEmail());
            ps.setString(7, p.getTelefone());
            ps.setString(8, p.getCelular());
            ps.setString(9, p.getCelular2());
            ps.setString(10, p.getFantasia());
            ps.setString(11, p.getNumero());
            ps.setInt(12, p.getIdpessoa());
            
            if (ps.executeUpdate() > 0)
                return true;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar dados na tabela pessoas! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Pessoa> buscar(Pessoa p){
        return new ArrayList<Pessoa>();
    }

    public List<Pessoa> buscar(String t) {
               List<Pessoa> lista = new ArrayList<Pessoa>();
       try {
//SELECT `idPessoa`, `nome`, `cpf`, `endereco`, `cep`, `bairro`, `email`, `telefone`, `celular`, `celular2` FROM `tb_Pessoas` WHERE 1           
           
            query = "select * from tb_Pessoas where nome like concat('%',?,'%') order by idPessoa";
            ps = con.prepareStatement(query);
            ps.setString(1, t);
            rs = ps.executeQuery();
            while (rs.next())
                lista.add(new Pessoa(
                        rs.getInt("idPessoa"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("endereco"),
                        rs.getString("cep"),
                        rs.getString("bairro"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("celular"),
                        rs.getString("celular2"),
                        rs.getString("fantasia"),
                        rs.getString("numero")
                ));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela pessoas! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
    
    public List<Pessoa> buscar(int t) {
               List<Pessoa> lista = new ArrayList<Pessoa>();
       try {
            query = "select * from tb_Pessoas where idPessoa = ? order by idPessoa";
            ps = con.prepareStatement(query);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            while (rs.next())
                lista.add(new Pessoa(
                        rs.getInt("idPessoa"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("endereco"),
                        rs.getString("cep"),
                        rs.getString("bairro"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("celular"),
                        rs.getString("celular2"),
                        rs.getString("fantasia"),
                        rs.getString("numero")
                ));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela pessoas! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
}