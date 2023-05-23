package br.sc.senac.mca.model;

import java.util.Date;

public class Client {

    private Integer codigo;
    private String nome;
    private String cpf;
    private Date nascimento; //a data de Nascimento será do tipo Date, porém, do pacote SQL.DATE, cuidado ao importar.
    private String sexo;
    private String fone;
    private String endereco;

    public Client(){

    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getCodigo() {
        return codigo;
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
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

}
