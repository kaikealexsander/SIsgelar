package sisgelar.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import sisgelar.dao.OrdemServicoDao;
import sisgelar.model.OrdemServico;


/**
 *
 * @author Kaike Leite
 */
public abstract class OrdemServicoController {
    
    public static boolean cadastrar(OrdemServico p){
        OrdemServicoDao dao = new OrdemServicoDao();
        return dao.inserir(p);
    }
    
    public static boolean remover(OrdemServico p){
        return new OrdemServicoDao().excluir(p);
    }

    public static List<OrdemServico> pesquisar(String t) {
        OrdemServicoDao dao = new OrdemServicoDao();
        List<OrdemServico> pessoas = dao.buscar(t);
        return pessoas;
    }
    public static List<OrdemServico> pesquisar(int t) {
        OrdemServicoDao dao = new OrdemServicoDao();
        List<OrdemServico> pessoas = dao.buscar(t);
        return pessoas;
    }

    public static boolean modificar(OrdemServico p) {
        OrdemServicoDao dao = new OrdemServicoDao();
        return dao.alterar(p);
    }
}