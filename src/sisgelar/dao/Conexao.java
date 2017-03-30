/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgelar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sisgelar.ExceptionDialog;

/**
 *
 * @author Kaike Leite
 */
public class Conexao {
    protected Connection con;
    protected Statement st;
    protected String query;

    public Conexao() {
        try {            
            final String URL = "jdbc:mysql://179.108.181.193:3306/Sisar";
            final String DRIVER = "com.mysql.jdbc.Driver";
            final String USUARIO = "trampo";
            final String SENHA = "killerbee";
//            final String URL = "jdbc:mysql://localhost/Sisar";
//            final String DRIVER = "com.mysql.jdbc.Driver";
//            final String USUARIO = "root";
//            final String SENHA = "";
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USUARIO,SENHA);
            st = con.createStatement();
            
        } catch (Throwable e) {
//            JOptionPane.showMessageDialog(null,"Falha ao conectar ao banco de dados!\n"+e);
//            e.printStackTrace();
            ExceptionDialog Id = new ExceptionDialog("Erro inesperado!", "Ocorreu uma falha durante a ultima consulta", e);
            Id.setVisible(true);
        }
    }
}
