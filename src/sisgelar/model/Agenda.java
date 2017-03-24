/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgelar.model;

/**
 *
 * @author Kaike Leite
 */
public class Agenda {
    private int idAgenda;
    private int idOS;
    private int idCliente;
    private String horario;

    public Agenda() {
    }

    public Agenda(int idAgenda, int idOS, int idCliente, String horario) {
        this.idAgenda = idAgenda;
        this.idOS = idOS;
        this.idCliente = idCliente;
        this.horario = horario;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
       
}
