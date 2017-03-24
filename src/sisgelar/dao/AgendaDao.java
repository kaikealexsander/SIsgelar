package sisgelar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sisgelar.model.Agenda;

public class AgendaDao extends Conexao{
    private PreparedStatement ps;
    private ResultSet rs;

    public boolean inserir(Agenda p){
        try {
            query = "insert into tb_Agenda values(0,?,?,?,?)";
                ps = con.prepareStatement(query);
                ps.setInt(1, p.getIdAgenda());
                ps.setInt(2, p.getIdOS());
                ps.setInt(3, p.getIdCliente());
                ps.setString(4, p.getHorario());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados na tabela Agenda! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean excluir(Agenda p){
        try {
            query = "delete from tb_Agenda where idAgenda=?";
                ps = con.prepareStatement(query);
                ps.setInt(1, p.getIdAgenda());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir dados na tabela Agenda! \n"+e);
            e.printStackTrace();
        }
        return false;
    }

    public boolean alterar(Agenda p){
        try {
            query = "update tb_Agendas set nome=?, cpf=?, endereco=?, cep=?, bairro=?, email=?, telefone=?, "
                    + "celular=?, celular2=?, fantasia=?, numero=? where idAgenda=?";
                ps = con.prepareStatement(query);
                ps.setInt(1, p.getIdOS());
                ps.setInt(2, p.getIdCliente());
                ps.setString(3, p.getHorario());
                ps.setInt(4, p.getIdAgenda());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar dados na tabela pessoas! \n"+e);
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Agenda> buscar(Agenda p){
        return new ArrayList<Agenda>();
    }

    public List<Agenda> buscar(String t) {
               List<Agenda> lista = new ArrayList<Agenda>();
       try {
            query = "select * from tb_Agenda where data like concat('%',?,'%') order by idAgenda";
                ps = con.prepareStatement(query);
                ps.setString(1, t);
           rs = ps.executeQuery();
            while (rs.next())
                lista.add(new Agenda(
                        rs.getInt("idAgenda"),
                        rs.getInt("idOs"),
                        rs.getInt("idCliente"),
                        rs.getString("data") ));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela pessoas! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
    
    public List<Agenda> buscar(int t) {
               List<Agenda> lista = new ArrayList<Agenda>();
       try {
            query = "select * from tb_Agenda where idAgenda = ? order by idAgenda";
                ps = con.prepareStatement(query);
                ps.setInt(1, t);
           rs = ps.executeQuery();
            while (rs.next())
                lista.add(new Agenda(
                        rs.getInt("idAgenda"),
                        rs.getInt("idOs"),
                        rs.getInt("idCliente"),
                        rs.getString("data") ));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados na tabela Agenda! \n"+e);
            e.printStackTrace();
            lista = null;
        }
        return lista;
    }
}