package sisgelar.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import sisgelar.dao.PessoaDao;
import sisgelar.model.Pessoa;


/**
 *
 * @author Kaike Leite
 */
public abstract class PessoaController {
    
    public static boolean cadastrar(Pessoa p){
        PessoaDao dao = new PessoaDao();
        return dao.inserir(p);
    }
    
    public static boolean remover(Pessoa p){
        return new PessoaDao().excluir(p);
    }

    public static List<Pessoa> pesquisar(String t) {
        PessoaDao dao = new PessoaDao();
        List<Pessoa> pessoas = dao.buscar(t);
        return pessoas;
    }
    public static List<Pessoa> pesquisar(int t) {
        PessoaDao dao = new PessoaDao();
        List<Pessoa> pessoas = dao.buscar(t);
        return pessoas;
    }

    public static boolean modificar(Pessoa p) {
        PessoaDao dao = new PessoaDao();
        return dao.alterar(p);
    }
}
