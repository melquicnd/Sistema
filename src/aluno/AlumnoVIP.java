/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;



public class AlumnoVIP {
    
    private String nome;
    private String email;
    private String bairro;
    private String numero;
    private String aniversario;
    private String whats;
    private String celular;
    private String Obiservaçoes;
    private String endereco;
    
    public AlumnoVIP(){}

    public AlumnoVIP(String nome, String email, String bairro, String numero, String aniversario, String whats, String celular, String Obiservaçoes, String endereco) {
        this.nome = nome;
        this.email = email;
        this.bairro = bairro;
        this.numero = numero;
        this.aniversario = aniversario;
        this.whats = whats;
        this.celular = celular;
        this.Obiservaçoes = Obiservaçoes;
        this.endereco =endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getWhats() {
        return whats;
    }

    public void setWhats(String whats) {
        this.whats = whats;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObiservaçoes() {
        return Obiservaçoes;
    }

    public void setObiservaçoes(String Obiservaçoes) {
        this.Obiservaçoes = Obiservaçoes;
    }
    
    
}
