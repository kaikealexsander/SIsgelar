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
public class Pessoa {
    private int idpessoa;
    private String nome;
    private String cpf;
    private String endereco;
    private String cep;
    private String bairro;
    private String email;
    private String telefone;
    private String celular;
    private String celular2;
    private String fantasia;
    private String numero;
    

    public Pessoa() {
    }

    public Pessoa(int idpessoa, String nome, String cpf, String endereco, String cep, String bairro, String email, String telefone, String celular, String celular2, String fantasia, String numero) {
        this.idpessoa   = idpessoa;
        this.nome       = nome;
        this.cpf        = cpf;
        this.endereco   = endereco;
        this.cep        = cep;
        this.bairro     = bairro;
        this.email      = email;
        this.telefone   = telefone;
        this.celular    = celular;
        this.celular2   = celular2;
        this.fantasia   = fantasia;
        this.numero     = numero;
    }

    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    

    @Override
    public String toString() {
        return "Pessoa{" + "idpessoa=" + idpessoa + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", cep=" + cep + ", bairro=" + bairro + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + ", celular2=" + celular2 + '}';
    }
}