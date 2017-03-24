/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgelar.model;

/**
 *
 * @author kaikealexsander
 */

//SELECT `idProdCliente`, `idCliente`, `marca`, `potencia`, `voltagem`, `modelo`, `localizacao` FROM `tb_ProdCliente` WHERE 1
public class ProdutoCliente {
    private int idProdCliente;
    private int idCliente;
    private String marca;
    private String potencia;
    private String voltagem;
    private String modelo;
    private String localizacao;

    public ProdutoCliente() {
    }

    public ProdutoCliente(int idProdCliente, int idCliente, String marca, String potencia, String voltagem, String modelo, String localizacao) {
        this.idProdCliente = idProdCliente;
        this.idCliente = idCliente;
        this.marca = marca;
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.modelo = modelo;
        this.localizacao = localizacao;
    }

    public int getIdProdCliente() {
        return idProdCliente;
    }

    public void setIdProdCliente(int idProdCliente) {
        this.idProdCliente = idProdCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "ProdutoCliente{" + "idProdCliente=" + idProdCliente + ", idCliente=" + idCliente + ", marca=" + marca + ", potencia=" + potencia + ", voltagem=" + voltagem + ", modelo=" + modelo + ", localizacao=" + localizacao + '}';
    }
    
    
   
}