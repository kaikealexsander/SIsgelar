/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisgelar.model;

/**
 *
 * @author kaike
 */
public class Produto {
    private int codProd;
    private String produto;
    private String descricao;
    private double valorUnitario;
    private int codCategoria;
    private int qtdMinima;
    private int qtdAtual;
    private double lucro;
    private byte[] imagem;

    public Produto() {
    }

    public Produto(int codProd, String produto, String descricao, double valorUnitario, int codCategoria, int qtdMinima, int qtdAtual, double lucro, byte[] imagem) {
        this.codProd = codProd;
        this.produto = produto;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.codCategoria = codCategoria;
        this.qtdMinima = qtdMinima;
        this.qtdAtual = qtdAtual;
        this.lucro = lucro;
        this.imagem = imagem;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
}
