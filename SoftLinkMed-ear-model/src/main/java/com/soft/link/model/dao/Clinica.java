package com.soft.link.model.dao;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jakson Wilson Bonfim de Lima
 */
public class Clinica implements Serializable {

    private Integer id_clinica;

    private Integer id_endereco;

    private Integer cnpj;

    private String razao_social;

    private String nome_fantasia;

    public Clinica() {
    }

    public Integer getId_clinica() {
        return id_clinica;
    }

    public void setId_clinica(Integer id_clinica) {
        this.id_clinica = id_clinica;
    }

    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id_clinica);
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
        final Clinica other = (Clinica) obj;
        return Objects.equals(this.id_clinica, other.id_clinica);
    }

}
