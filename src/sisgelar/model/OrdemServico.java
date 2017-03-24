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
public class OrdemServico {
    private int idOS;
    private int idCliente;
    private int idProdCliente;
    private String horario;
    private String descricao;
    private double valor;

    public OrdemServico() {
    }

    public OrdemServico(int idOS, int idCliente, int idProdCliente, String horario, String descricao, double valor) {
        this.idOS = idOS;
        this.idCliente = idCliente;
        this.idProdCliente = idProdCliente;
        this.horario = horario;
        this.descricao = descricao;
        this.valor = valor;
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

    public int getIdProdCliente() {
        return idProdCliente;
    }

    public void setIdProdCliente(int idProdCliente) {
        this.idProdCliente = idProdCliente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}