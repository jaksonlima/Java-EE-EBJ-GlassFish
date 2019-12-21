package com.soft.link.model.dao;

import com.soft.link.med.model.Entidade;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jakson Wilson Bonfim de Lima
 */
public class Pessoa extends Entidade implements Serializable {

    private Integer id_pessoa;

    private Integer cpf;

    private String nome_pessoa;

    private String nome_social;

    public Pessoa() {
    }

    public Integer getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Integer id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id_pessoa);
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
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.id_pessoa, other.id_pessoa);
    }

}
