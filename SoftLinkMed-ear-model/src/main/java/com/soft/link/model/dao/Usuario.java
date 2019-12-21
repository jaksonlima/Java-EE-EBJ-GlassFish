package com.soft.link.model.dao;

import java.util.Objects;

public class Usuario {

    private String nome;

    private String Senha;

    private Integer perfilAcesso;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public Integer getPerfilAcesso() {
        return perfilAcesso;
    }

    public void setPerfilAcesso(Integer perfilAcesso) {
        this.perfilAcesso = perfilAcesso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.nome, other.nome);
    }

}
