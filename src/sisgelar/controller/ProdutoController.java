package sisgelar.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import sisgelar.dao.ProdutoDao;
import sisgelar.model.Produto;

/**
 *
 * @author Kaike Leite
 */
public abstract class ProdutoController {
    
    public static boolean cadastrar(Produto p){
        ProdutoDao dao = new ProdutoDao();
        return dao.inserir(p);
    }
    
    public static boolean remover(Produto p){
        return new ProdutoDao().excluir(p);
    }

    public static List<Produto> pesquisar(String t) {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> pessoas = dao.buscar(t);
        return pessoas;
    }
    public static List<Produto> pesquisar(int t) {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> pessoas = dao.buscar(t);
        return pessoas;
    }

    public static boolean modificar(Produto p) {
        ProdutoDao dao = new ProdutoDao();
        return dao.alterar(p);
    }
}
