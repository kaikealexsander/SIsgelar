package sisgelar.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import sisgelar.dao.AgendaDao;
import sisgelar.model.Agenda;


/**
 *
 * @author Kaike Leite
 */
public abstract class AgendaController {
    
    public static boolean cadastrar(Agenda p){
        AgendaDao dao = new AgendaDao();
        return dao.inserir(p);
    }
    
    public static boolean remover(Agenda p){
        return new AgendaDao().excluir(p);
    }

    public static List<Agenda> pesquisar(String t) {
        AgendaDao dao = new AgendaDao();
        List<Agenda> pessoas = dao.buscar(t);
        return pessoas;
    }
    public static List<Agenda> pesquisar(int t) {
        AgendaDao dao = new AgendaDao();
        List<Agenda> pessoas = dao.buscar(t);
        return pessoas;
    }

    public static boolean modificar(Agenda p) {
        AgendaDao dao = new AgendaDao();
        return dao.alterar(p);
    }
}