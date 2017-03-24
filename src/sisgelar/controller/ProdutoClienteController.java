package sisgelar.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import sisgelar.dao.ProdutoClienteDao;
import sisgelar.model.ProdutoCliente;


/**
 *
 * @author Admin
 */
public abstract class ProdutoClienteController {
    
    public static boolean cadastrar(ProdutoCliente p){
        ProdutoClienteDao dao = new ProdutoClienteDao();
        return dao.inserir(p);
    }
    
    public static boolean remover(ProdutoCliente p){
        return new ProdutoClienteDao().excluir(p);
    }

    public static List<ProdutoCliente> pesquisar(String t) {
        ProdutoClienteDao dao = new ProdutoClienteDao();
        List<ProdutoCliente> pessoas = dao.buscar(t);
        return pessoas;
    }
    public static List<ProdutoCliente> pesquisar(int t) {
        ProdutoClienteDao dao = new ProdutoClienteDao();
        List<ProdutoCliente> pessoas = dao.buscar(t);
        return pessoas;
    }

    public static boolean modificar(ProdutoCliente p) {
        ProdutoClienteDao dao = new ProdutoClienteDao();
        return dao.alterar(p);
    }
    
}
